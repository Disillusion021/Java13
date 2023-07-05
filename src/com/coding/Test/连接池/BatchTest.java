package com.coding.Test.连接池;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BatchTest {
    public static void main(String[] args) throws Exception {
        // traditionalLoopInsert();
        batchLoopInsert();
    }

    private static void traditionalLoopInsert() throws Exception {
        // 从数据库连接池中获取一条连接
        Connection connection = DruidUtil.getConnection();
        String sql = "insert into account(id, name, money) values (null, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            ps.setString(1, "BatchTest" + i);
            ps.setInt(2, 10000);
            ps.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统的方式 耗时: " + (end - start) + "ms"); //6708ms
        // 关闭连接
        DruidUtil.close(null, null, connection);
    }

    // 一条连接可以多次提交事务,但是每个事务都是独立的,提交后便不能rollback回滚了
    private static void batchLoopInsert() throws Exception {
        // 从数据库连接池中获取一条连接
        Connection connection = DruidUtil.getConnection();
        connection.setAutoCommit(false); // 设置事务后,即使执行了executeBatch()也不会自动提交事务,数据库中依然没有数据
        String sql = "insert into account(id, name, money) values (null, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            ps.setString(1, "BatchTest" + i);
            ps.setInt(2, 1000);
            // 将sql语句加入到批处理中
            ps.addBatch();
            // 满1000条执行一批
            if ((i + 1) % 1000 == 0) {
                ps.executeBatch(); // 批量执行
                connection.commit(); // 提交事务, 设置事务后,必须手动提交事务
                ps.clearBatch(); // 批量执行完清空这一批
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("批处理的方式 耗时: " + (end - start) + "ms"); //46ms
        // 关闭连接
        DruidUtil.close(null, null, connection);
    }
}

package com.coding.Test.连接池;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 数据库连接池测试
 */
// 数据库连接池基本介绍
// 1. 预先在缓冲池中放入一定数量的连接,当需要建立数据库连接时,只需从"缓冲池"中取出一个,使用完毕之后再放回去.
// 2. 数据库连接池负责分配,管理和释放数据库连接,它允许应用程序 重复使用 一个现有的数据库连接,而不是重新建立一个.
// 3. 当应用程序向连接池请求的连接数超过最大连接数量时,这些请求将被加入到等待队列中.(缓冲层的作用)
public class Druid_ {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/heima-test?rewriteBatchedStatements=true&serverTimezone=GMT%2B8";
    public static final String USER = "root";
    public static final String PASSWORD = "Hstech2012@";

    @Test
    public void testDruid_() throws Exception {
        // 1. 加入 Druid jar包
        // 2. 加入 配置文件 druid.properties, 将该文件拷贝项目的src目录
        // 3. 创建properties对象, 读取配置文件
        Properties properties = new Properties();
        properties.load(Files.newInputStream(Paths.get("src\\druid.properties")));
        // 4. 创建一个指定参数的数据库连接池 DruidDataSource对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        long a = System.currentTimeMillis();
        for (int i = 0; i < 500000; i++) {
            Connection connection = dataSource.getConnection();
            connection.close();
        }
        long b = System.currentTimeMillis();
        System.out.println("Druid_耗时: " + (b - a) + "ms"); // 500000次耗时791s
    }

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        long a = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD); //1899ms
            connection.close();
        }
        long b = System.currentTimeMillis();
        System.out.println("不用连接池耗时: " + (b - a) + "ms"); // 5000次耗时38s;50000次耗时710s
    }
}

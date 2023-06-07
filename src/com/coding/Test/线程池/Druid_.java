package com.coding.Test.线程池;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.Properties;

public class Druid_ {

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
        System.out.println("Druid_耗时: " + (b - a) + "ms");
    }
}

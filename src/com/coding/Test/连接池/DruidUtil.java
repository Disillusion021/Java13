package com.coding.Test.连接池;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DruidUtil {
    static DataSource ds;

    static {
        try {
            Properties properties = new Properties();
            properties.load(Files.newInputStream(Paths.get("src\\druid.properties")));
            // 根据配置文件创建数据库连接池
            ds = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 从druid中获取一条数据库连接
    public static Connection getConnection() throws Exception {
        return ds.getConnection();
    }

    // 关闭连接, 在数据库连接池中,
    // 强调: 在数据库连接池技术中,close,并不是真正的关闭连接,而是将使用的连接对象Connection对象放回数据库连接池
    public static void close(ResultSet rs, PreparedStatement ps, Connection conn) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

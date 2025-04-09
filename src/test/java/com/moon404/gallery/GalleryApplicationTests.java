package com.moon404.gallery;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootTest
class GalleryApplicationTests {

    @Test
    void contextLoads() throws SQLException {

//        public class TestConnection {
//            public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://db.wqqflvsxyicalmwrzqyx.supabase.co:5432/postgres",
                "postgres",
                "Moon@404"
        );
        System.out.println("✅ Connected!");
        conn.close();
//            }
//        }

    }

}

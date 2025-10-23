package com.example.JDBC;
import javax.sql.DataSource;
import java.sql.Connection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class TestDB {
    @Bean
    CommandLineRunner testConnection(DataSource dataSource) {
        return args -> {
            System.out.println("🔍 Testing JDBC connection...");
            try (Connection conn = dataSource.getConnection()) {
                if (conn.isValid(2)) {
                    System.out.println("✅ Successfully connected to the database!");
                } else {
                    System.out.println("❌ Connection failed!");
                }
            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            }
        };
    }
}

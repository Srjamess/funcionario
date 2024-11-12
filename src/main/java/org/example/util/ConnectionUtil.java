package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static final String URL = "jdbc:postgresql://localhost:5432/funcionario";
    private static final String USER = "postgres";
    private static  final String PASSWORD="admin";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static class TestConnection {
        public static void main(String[] args) {
            try (Connection conn = ConnectionUtil.getConnection()) {
                if (conn != null) {
                    System.out.println("Conexión exitosa");
                } else {
                    System.out.println("Error al conectar");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}

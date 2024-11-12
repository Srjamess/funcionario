package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static final String URL = "URL";//poner la url de la base de datos
    private static final String USER = "admin";//poner el usuario de la base de datos
    private static  final String PASSWORD="1234";//poner la contraseña de la base de datos

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}

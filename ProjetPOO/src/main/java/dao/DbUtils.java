package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DbUtils {
    
    public static final SimpleDateFormat SQL_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private static Connection connection;
    public static Connection getConnection() throws Exception {

        //connetion a la base
        if (connection == null) {

            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipsl?useSSL=false", "root", "passer");

        }
        return connection;
    }

    public static void disconnect() throws SQLException {
        if (connection != null) {
            connection.close();
            connection = null;
        }
    }

    public static void main(String[] args) throws Exception {
        Connection conn = DbUtils.getConnection();
        System.out.println("connexion ok");
        DbUtils.disconnect();
        System.out.println("deconnexion ok");

    }
}

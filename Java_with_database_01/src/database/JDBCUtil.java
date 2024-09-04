package database;

import java.sql.*;

public class JDBCUtil {
    public static Connection getConnection() {
        Connection conn = null;

        try {
            //dang ki mySQL Driver voi driverMannager
           //DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            String url = "jdbc:mysql://localhost:3306/nhasach";
            String username = "root";
            String password = "123456789";

            //tao ket noi
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void printInfo(Connection conn) {
        try{
            if(conn != null) {
                DatabaseMetaData dbmd = conn.getMetaData();
                System.out.println(dbmd.getDatabaseProductVersion());
                System.out.println(dbmd.getDatabaseProductName());
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

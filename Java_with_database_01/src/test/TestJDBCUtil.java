package test;

import database.JDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCUtil {
    public static void main(String[] args) {
       /* //Buoi _03
        Connection connection = JDBCUtil.getConnection();
        JDBCUtil.printInfo(connection);
        System.out.println(connection);
       */
        try {
            //1. Tao ket noi
            Connection connection = JDBCUtil.getConnection();

            //2. Tao ra doi tuong statement
            Statement st = connection.createStatement();

            //3. Thuc thi 1 cau lenh SQL
            String sql = "INSERT INTO person(last_name, first_name, gender, dob, income)" +
                    "VALUES (\"Nguyen\", \"Van Tu\", \"M\", \"1995-05-10\", 10000000)";

            int check = st.executeUpdate(sql);

            //4. Xu ly ket qua
            System.out.println("So dong thay doi: " + check);
            if(check > 0){
                System.out.println("Them du lieu thanh cong !!!");
            }else {
                System.out.println("Them du lieu that bai !!!");
            }
            //5. Ngat ket noi
            JDBCUtil.closeConnection(connection);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

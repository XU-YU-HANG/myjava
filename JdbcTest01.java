package yh;

import java.sql.*;

public class JdbcTest01 {
    public static void main(String[] args) {
        Connection conn=null;
        Statement stmt =null;
        ResultSet rs=null;
        try {
            Driver driver=new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mysql","root","504207198");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("数据库连接"+conn);
        try {
            stmt=conn.createStatement();
            rs=stmt.executeQuery("select ename from emp");
            while (rs.next()){
                String a=rs.getString("ename");
                System.out.println(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }if(conn!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }if(stmt!=null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }



    }



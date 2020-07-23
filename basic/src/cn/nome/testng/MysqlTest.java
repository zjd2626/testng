package cn.nome.testng;



import java.sql.*;

public class MysqlTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://192.168.128.100/test";
        String user = "root";
        String password = "engine";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =  DriverManager.getConnection(url,user,password);
        String sql = "select * from a where id = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1,"1");
        ResultSet rs = statement.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("subject") + rs.getString("score"));
        }

        statement.close();
        conn.close();
    }

}

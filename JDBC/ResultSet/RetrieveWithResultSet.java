package JDBC.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveWithResultSet {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT","root", "");
            System.out.println("Database is connected !");
            System.out.println("<======================>");

            Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery("select * from user");

            resultSet.absolute(3);

            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));

            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

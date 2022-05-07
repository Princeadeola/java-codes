package JDBC.NIITDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DeleteFromTable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT","root", "");
            System.out.println("Database is connected !");
            Statement statement = con.createStatement();

            System.out.println("Deleting with a condition....");
            String deleteQuery = "DELETE FROM studentDB WHERE firstname = ?";
            PreparedStatement preparedStatement = con.prepareStatement(deleteQuery);
            preparedStatement.setString(1, "John");
            preparedStatement.executeUpdate();

            System.out.println("record deleted successfully!!!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

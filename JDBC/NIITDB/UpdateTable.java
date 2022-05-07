package JDBC.NIITDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) {
        Connection con = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT","root", "");
            Statement statement = con.createStatement();

            //Adding or inserting a column
//            System.out.println("Adding a column to the studentDB table ...");
//            String addColumn = "ALTER TABLE studentDB ADD Path varchar(50)";
//            statement.executeUpdate(addColumn);
//            System.out.println("Added a column to the studentDB table successfully");

            //Removing / deleting a column
//            System.out.println("Removing a column from the studentDB table ...");
//            String removeColumn = "ALTER TABLE studentDB DROP Path";
//            statement.executeUpdate(removeColumn);
//            System.out.println("Removed a column from the studentDB table successfully");

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

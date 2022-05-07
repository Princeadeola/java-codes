package JDBC.NIITDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Table {
    public static void main(String[] args) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = null;

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT","root", "");
            Statement statement = con.createStatement();

            System.out.println("Creating table ...");

            String query = "CREATE TABLE StudentDB("
                    + "ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL, "
                    + "firstname VARCHAR (25) NOT NULL, "
                    + "lastname VARCHAR (25) NOT NULL, "
                    + "age INTEGER)";

            statement.executeUpdate(query);
            System.out.println("Table created successfully!!!");

        }catch (Exception e){
            System.out.print("Table not created!");
            e.printStackTrace();
        }

    }
}

package JDBC.Transactions;

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

            // candidate table
//            String query = "CREATE TABLE candidates("
//                    + "ID INT PRIMARY KEY AUTO_INCREMENT NOT NULL, "
//                    + "first_name VARCHAR (25) NOT NULL, "
//                    + "last_name VARCHAR (25) NOT NULL, "
//                    + "dob VARCHAR (25) NOT NULL, "
//                    + "phone VARCHAR (25) NOT NULL, "
//                    + "email VARCHAR (25) NOT NULL)";

//            statement.executeUpdate(query1);

            // candidate skill table
            String query2 = "CREATE TABLE candidate_skills("
                    + "candidate_id INT, "
                    + "skill_id INT)";

            statement.executeUpdate(query2);
            System.out.println("Table created successfully!!!");

        }catch (Exception e){
            System.out.print("Table not created!");
            e.printStackTrace();
        }

    }
}

package JDBC.NIITDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertIntoTable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NIIT","root", "");
            System.out.println("Database is connected !");
            Statement statement = con.createStatement();

            System.out.println("Inserting data into the studentDB Table...");

            String record1 = "INSERT INTO StudentDB (firstname, lastname, age) VALUES ('John', 'Doe', 20)";
//            String record2 = "INSERT INTO StudentDB (firstname, lastname, age) VALUES ('Jane', 'Doe', 18)";
//            String record3 = "INSERT INTO StudentDB (firstname, lastname, age) VALUES ('Jack', 'Doe', 16)";

            statement.executeUpdate(record1);
//            statement.executeUpdate(record2);
//            statement.executeUpdate(record3);

            System.out.println("All records have been inserted into the studentDB Table!!!");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

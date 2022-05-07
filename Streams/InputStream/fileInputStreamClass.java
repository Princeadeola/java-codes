package Streams.InputStream;

//The FileInputStream class of the java.io package can
// be used to read data (in bytes) from files.
import java.io.FileInputStream;
public class fileInputStreamClass {
    public static void main(String args[]) {
        try {
            FileInputStream input = new FileInputStream("C:\\Java\\input.txt");
            // Returns the number of available bytes
            System.out.println("Available bytes at the beginning: " + input.available());
            System.out.println("Data in the file reading below-:- ");
            System.out.println("<=================================>");
             //Skips the 5 bytes
//            input.skip(5);
//            System.out.println("Input stream after skipping 5 bytes:");
            int i = input.read(); // Reads the first byte
            while(i != -1) {
                System.out.print((char)i);
                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
package Streams.OutputStream;

//The FileOutputStream class of the java.io package can be used to
// write data (in bytes) to the files.

import java.io.FileOutputStream;

public class FileOutPutStreamEx {
    public static void main(String[] args) {

//        String data = "This is a new line of text inside the file.";
//
//        try {
//            FileOutputStream output = new FileOutputStream("C:\\Java\\input.txt");
//
//            byte[] array = data.getBytes();
//
//            // Writes byte to the file
//            output.write(array);
//
//            output.close();
//        }
//
//        catch(Exception e) {
//            e.getStackTrace();
//        }

        FileOutputStream out = null;
        String data = "This is demo of a method";

        try {
            out = new FileOutputStream("C:\\Java\\input.txt");

            // Using write() method
            out.write(data.getBytes());

            // Using the flush() method
//            out.flush();
            out.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}

// <=========A Little Note============>
//flush() Method
//To clear the output stream, we can use the flush() method. This method
// forces the output stream to write all data to the destination.
//To write data to the file, we have used write() method.
//The getBytes() method used in the program converts a string into an array of bytes.
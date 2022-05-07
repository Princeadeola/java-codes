package Streams.InputStream;

//The FileReader class of the java.io package can be used to
// read data (in characters) from files.

import java.io.FileReader;
import java.nio.charset.Charset;

public class FileReaderClassEx {
    public static void main(String[] args) {

        try {
            // Creates a FileReader with default encoding
            FileReader input1 = new FileReader("C:\\Java\\input.txt");

            // Creates a FileReader specifying the encoding
            FileReader input2 = new FileReader("C:\\Java\\input.txt", Charset.forName("UTF8"));

            // Returns the character encoding of the file reader
            System.out.println("Character encoding of input1: " + input1.getEncoding());
            System.out.println("Character encoding of input2: " + input2.getEncoding());

            // Closes the reader
            input1.close();
            input2.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}

// <=========A Little Note============>
//input1 does not specify the character encoding. Hence the getEncoding()
// method returns the default character encoding.
//input2 specifies the character encoding, UTF8. Hence the getEncoding()
// method returns the specified character encoding.

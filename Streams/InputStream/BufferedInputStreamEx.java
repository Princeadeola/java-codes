package Streams.InputStream;
//The BufferedInputStream class of the java.io package is used
// with other input streams to read the data (in bytes) more efficiently.

import java.io.FileInputStream;
import java.io.BufferedInputStream;

public class BufferedInputStreamEx {

    public static void main(String args[]) {

        try {
            FileInputStream file = new FileInputStream("C:\\Java\\input.txt");

            // Creates a BufferedInputStream
            BufferedInputStream buffer = new BufferedInputStream(file);

            // Returns the available number of bytes
            System.out.println("Available bytes at the beginning: " + buffer.available());

            // Skips the 5 bytes
//            buffer.skip(5);
//            System.out.println("Input stream after skipping 5 bytes:");

            // Reads the first byte from input stream
            int i = buffer.read();
            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the input stream
                i = buffer.read();
            }

            // Closes the input stream
            buffer.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

// <=========A Little Note============>
//Working of BufferedInputStream
//The BufferedInputStream maintains an internal buffer of 8192 bytes.
//
//During the read operation in BufferedInputStream, a chunk of bytes
// is read from the disk and stored in the internal buffer. And from the
// internal buffer bytes are read individually.
//
//Hence, the number of communication to the disk is reduced. This is why
// reading bytes is faster using the BufferedInputStream.


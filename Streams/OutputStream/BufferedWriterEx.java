package Streams.OutputStream;

//The BufferedWriter class of the java.io package can be
// used with other writers to write data (in characters) more efficiently.

import java.io.FileWriter;
import java.io.BufferedWriter;

public class BufferedWriterEx {
    public static void main(String[] args) {

        String data = "This is a demo of the flush method";

        try {
            // Creates a FileWriter
            FileWriter file = new FileWriter(" flush.txt");

            // Creates a BufferedWriter
            BufferedWriter output = new BufferedWriter(file);

            // Writes data to the file
            output.write(data);

            // Flushes data to the destination
            output.flush();
            System.out.println("Data is flushed to the file.");

            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}

// <=========A Little Note============>
//The BufferedWriter maintains an internal buffer of 8192 characters.
//
//During the write operation, the characters are written to the internal
// buffer instead of the disk. Once the buffer is filled or the writer is
// closed, the whole characters in the buffer are written to the disk.
//
//Hence, the number of communication to the disk is reduced. This is why
// writing characters is faster using BufferedWriter.



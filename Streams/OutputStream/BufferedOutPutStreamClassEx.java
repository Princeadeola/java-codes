package Streams.OutputStream;

//The BufferedOutputStream class of the java.io package is used with
// other output streams to write the data (in bytes) more efficiently.

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutPutStreamClassEx {
    public static void main(String[] args) {
        String data = "This is a another line of text inside the file";
        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("C:\\Java\\input.txt");
            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);
            byte[] array = data.getBytes();
            // Writes data to the output stream
            output.write(array);
            // Flushes data to the destination
            output.flush();
            System.out.println("Data is flushed to the file.");
            output.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

// <=========A Little Note============>
//The BufferedOutputStream maintains an internal buffer of 8192 bytes.
//
//During the write operation, the bytes are written to the internal
// buffer instead of the disk. Once the buffer is filled or the stream
// is closed, the whole buffer is written to the disk.
//
//Hence, the number of communication to the disk is reduced.
// This is why writing bytes is faster using BufferedOutputStream.




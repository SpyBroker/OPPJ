package p10;
import java.io.*;

public class RAFFileCopy {
    public static void main(String[] args) {
        try {
            // Open source file in read mode
            RandomAccessFile file = new RandomAccessFile("students.txt", "r");

            int data;
            String content = "";

            // Read data from source file
            while ((data = file.read()) != -1) {
                content += (char) data;
            }

            file.close();

            // Use same object to open destination file in write mode
            file = new RandomAccessFile("destination.txt", "rw");

            // Write data to destination file
            file.writeBytes(content);

            file.close();

            System.out.println("Data copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
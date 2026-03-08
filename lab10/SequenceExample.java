package p10;
import java.io.*;

public class SequenceExample {
    public static void main(String[] args) {
        try {
            // Open first two files
            FileInputStream f1 = new FileInputStream("students.txt");
            FileInputStream f2 = new FileInputStream("copy.txt");

            // Combine the two input streams
            SequenceInputStream sis = new SequenceInputStream(f1, f2);

            // Open third file to write combined data
            FileOutputStream fos = new FileOutputStream("file3.txt");

            int data;

            // Read from SequenceInputStream and write to file3
            while ((data = sis.read()) != -1) {
                fos.write(data);
            }

            sis.close();
            fos.close();

            // Open third file to display content
            FileInputStream f3 = new FileInputStream("file3.txt");

            System.out.println("Contents of file3:");

            while ((data = f3.read()) != -1) {
                System.out.print((char) data);
            }

            f3.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
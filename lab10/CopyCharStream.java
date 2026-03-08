package p10;
import java.io.*;
import java.util.*;

public class CopyCharStream {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String src = sc.nextLine();

        System.out.print("Enter destination file: ");
        String dest = sc.nextLine();

        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);

        int ch;

        while((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();

        System.out.println("File copied successfully.");
    }
}
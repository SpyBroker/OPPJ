package p10;
import java.io.*;
import java.util.*;

public class CopyByteStream {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file: ");
        String src = sc.nextLine();

        System.out.print("Enter destination file: ");
        String dest = sc.nextLine();

        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        int i;

        while((i = fis.read()) != -1) {
            fos.write(i);
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully.");
    }
}
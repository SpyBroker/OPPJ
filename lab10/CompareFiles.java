package p10;
import java.io.*;
import java.util.*;

public class CompareFiles {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first file: ");
        String file1 = sc.nextLine();

        System.out.print("Enter second file: ");
        String file2 = sc.nextLine();

        FileInputStream f1 = new FileInputStream(file1);
        FileInputStream f2 = new FileInputStream(file2);

        int b1, b2, pos = 1;
        boolean diff = false;

        while((b1 = f1.read()) != -1 && (b2 = f2.read()) != -1) {
            if(b1 != b2) {
                System.out.println("Files differ at byte position: " + pos);
                diff = true;
                break;
            }
            pos++;
        }

        if(!diff)
            System.out.println("Files are identical.");

        f1.close();
        f2.close();
    }
}
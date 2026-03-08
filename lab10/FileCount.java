package p10;
import java.io.*;
import java.util.*;

public class FileCount {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fname = sc.nextLine();

        FileReader fr = new FileReader(fname);
        BufferedReader br = new BufferedReader(fr);

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        String line;

        while((line = br.readLine()) != null) {
            lineCount++;

            charCount += line.length();

            String words[] = line.split("\\s+");
            wordCount += words.length;
        }

        br.close();

        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
    }
}
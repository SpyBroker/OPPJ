import java.io.*;
import java.util.*;

class IO_Demo {

    public static void main(String[] args) throws Exception {

        // =========================
        // 1. STREAM BASICS
        // =========================

        System.out.println("Using System.out (PrintStream)");
        System.err.println("Using System.err (Error stream)");

        int ch = 'A';
        System.out.write(ch); // write() outputs single byte
        System.out.println();

        // =========================
        // 2. WRAPPER CLASSES
        // =========================

        Integer intObj = Integer.valueOf(10); // primitive → object
        Double doubleObj = Double.valueOf(20.5);

        System.out.println("Wrapper Integer: " + intObj);
        System.out.println("Wrapper Double: " + doubleObj);

        // =========================
        // 3. BUFFEREDREADER (Console Input)
        // =========================

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String str = br.readLine(); // readLine()

        System.out.print("Enter an integer: "); 
        int num = Integer.parseInt(br.readLine()); // parseInt()

        System.out.print("Enter a float: ");
        float f = Float.parseFloat(br.readLine()); // parseFloat()

        System.out.println("You entered: " + str + ", " + num + ", " + f);

        // =========================
        // 4. SCANNER CLASS
        // =========================

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine(); // nextLine()

        System.out.print("Enter age: ");
        int age = sc.nextInt(); // nextInt()

        System.out.print("Enter salary: ");
        double sal = sc.nextDouble(); // nextDouble()

        System.out.println("Scanner Input: " + name + ", " + age + ", " + sal);

        // =========================
        // 5. PRINTWRITER (Console Output)
        // =========================

        PrintWriter pw = new PrintWriter(System.out, true); // auto flush
        pw.println("Using PrintWriter to print");

        // =========================
        // 6. FILE OUTPUT STREAM (Writing bytes)
        // =========================

        FileOutputStream fos = new FileOutputStream("test.txt");

        String data = "Hello File";
        byte[] bytes = data.getBytes();

        fos.write(bytes); // write() to file
        fos.close(); // close file

        // =========================
        // 7. FILE INPUT STREAM (Reading bytes)
        // =========================

        FileInputStream fis = new FileInputStream("test.txt");

        int i;
        System.out.print("Reading file: ");
        while ((i = fis.read()) != -1) { // read() byte by byte
            System.out.print((char) i);
        }
        fis.close();

        System.out.println();

        // =========================
        // 8. FILEWRITER & BUFFEREDWRITER
        // =========================

        FileWriter fw = new FileWriter("charfile.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Writing using BufferedWriter");
        bw.newLine(); // new line
        bw.write("Second line");

        bw.close();

        // =========================
        // 9. FILEREADER & BUFFEREDREADER
        // =========================

        FileReader fr = new FileReader("charfile.txt");
        BufferedReader br2 = new BufferedReader(fr);

        String line;
        System.out.println("Reading char file:");
        while ((line = br2.readLine()) != null) {
            System.out.println(line);
        }
        br2.close();

        // =========================
        // 10. PRINTWRITER (File Writing)
        // =========================

        PrintWriter pwFile = new PrintWriter(new File("pwfile.txt"));
        pwFile.println("Writing using PrintWriter");
        pwFile.println("Another line");
        pwFile.close();

        // =========================
        // 11. FILE COPYING (Important concept)
        // =========================

        FileInputStream fin = new FileInputStream("test.txt");
        FileOutputStream fout = new FileOutputStream("copy.txt");

        int b;
        while ((b = fin.read()) != -1) {
            fout.write(b); // copy byte by byte
        }

        fin.close();
        fout.close();

        System.out.println("File copied successfully!");

        // =========================
        // 12. DataInputStream (mentioned in PDF)
        // =========================

        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("DataInputStream created (legacy input method)");
    }
}
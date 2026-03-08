package p10;

import java.io.*;
import java.util.*;

public class StudentFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileOutputStream fos = new FileOutputStream("students.txt");

            System.out.print("Enter Roll No: ");
            String roll = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            String marks = sc.nextLine();

            String data = "Roll No: " + roll + "\nName: " + name + "\nSubject: " + subject + "\nMarks: " + marks;

            fos.write(data.getBytes());
            fos.close();

            FileInputStream fis = new FileInputStream("students.txt");
            int i;

            System.out.println("\nData from file:");
            while((i = fis.read()) != -1) {
                System.out.print((char)i);
            }

            fis.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
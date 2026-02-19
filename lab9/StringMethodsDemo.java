package lab9;

import java.util.Scanner;

public class StringMethodsDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.nextLine();

        System.out.println("\nOriginal String: \"" + str + "\"");

        // 1) replace()
        String replaced = str.replace("KIIT", "KIIT University");
        System.out.println("\n1) After replace(): " + replaced);

        // 2) trim()
        String trimmed = str.trim();
        System.out.println("\n2) After trim(): \"" + trimmed + "\"");

        // 3) split()
        String[] words = trimmed.split(" ");
        System.out.println("\n3) After split():");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + words[i]);
        }

        // 4) charAt()
        char ch = trimmed.charAt(5);   // example: character at index 5
        System.out.println("\n4) Using charAt(5): " + ch);

        // 5) substring()
        String sub = trimmed.substring(0, 10);  // first 10 characters
        System.out.println("\n5) Using substring(0,10): " + sub);

        sc.close();
    }
}

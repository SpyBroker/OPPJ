package lab9;

import java.util.Scanner;

public class ConcatAndSplit {
    public static void main(String[] args) {

        // Check command line argument
        if (args.length == 0) {
            System.out.println("Please provide first string as command line argument.");
            return;
        }

        String str1 = args[0];   // "Welcome" from command line

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();   // "Back to India"

        // Concatenate both strings
        String concatenated = str1 + " " + str2;

        System.out.println("\nConcatenated String: " + concatenated);

        // Split into 4 parts
        String[] parts = concatenated.split(" ");

        if (parts.length >= 4) {
            String s1 = parts[0];
            String s2 = parts[1];
            String s3 = parts[2];
            String s4 = parts[3];

            System.out.println("\nAfter Splitting:");
            System.out.println("String 1: " + s1);
            System.out.println("String 2: " + s2);
            System.out.println("String 3: " + s3);
            System.out.println("String 4: " + s4);
        } else {
            System.out.println("The concatenated string does not have 4 parts.");
        }

        sc.close();
    }
}

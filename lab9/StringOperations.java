package lab9;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        int choice;

        do {
            System.out.println("\n--- STRING OPERATIONS MENU ---");
            System.out.println("1. Change case of string");
            System.out.println("2. Reverse the string");
            System.out.println("3. Compare two strings");
            System.out.println("4. Insert one string into another");
            System.out.println("5. Convert to Uppercase and Lowercase");
            System.out.println("6. Check character present and its position");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Count words, vowels and consonants");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1: 
                    String changedCase = "";
                    for (char c : str1.toCharArray()) {
                        if (Character.isLowerCase(c))
                            changedCase += Character.toUpperCase(c);
                        else if (Character.isUpperCase(c))
                            changedCase += Character.toLowerCase(c);
                        else
                            changedCase += c;
                    }
                    System.out.println("Changed case string: " + changedCase);
                    break;

                case 2: 
                    String reversed = new StringBuilder(str1).reverse().toString();
                    System.out.println("Reversed string: " + reversed);
                    break;

                case 3: 
                    System.out.print("Enter second string: ");
                    String str2 = sc.nextLine();
                    if (str1.equals(str2))
                        System.out.println("Strings are equal.");
                    else
                        System.out.println("Strings are not equal.");
                    break;

                case 4: 
                    System.out.print("Enter string to insert: ");
                    String insertStr = sc.nextLine();
                    System.out.print("Enter position to insert: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos >= 0 && pos <= str1.length()) {
                        String result = str1.substring(0, pos) + insertStr + str1.substring(pos);
                        System.out.println("String after insertion: " + result);
                    } else {
                        System.out.println("Invalid position!");
                    }
                    break;

                case 5: 
                    System.out.println("Uppercase: " + str1.toUpperCase());
                    System.out.println("Lowercase: " + str1.toLowerCase());
                    break;

                case 6: 
                    System.out.print("Enter character to search: ");
                    char ch = sc.next().charAt(0);
                    boolean found = false;

                    for (int i = 0; i < str1.length(); i++) {
                        if (str1.charAt(i) == ch) {
                            System.out.println("Character found at position: " + i);
                            found = true;
                        }
                    }
                    if (!found)
                        System.out.println("Character not found.");
                    break;

                case 7: // Palindrome
                    String rev = new StringBuilder(str1).reverse().toString();
                    if (str1.equals(rev))
                        System.out.println("String is Palindrome.");
                    else
                        System.out.println("String is not Palindrome.");
                    break;

                case 8: // Count words, vowels, consonants
                    int words = 0, vowels = 0, consonants = 0;

                    String trimmed = str1.trim();
                    if (!trimmed.isEmpty())
                        words = trimmed.split("\\s+").length;

                    for (char c : str1.toCharArray()) {
                        if ("AEIOUaeiou".indexOf(c) != -1)
                            vowels++;
                        else if (Character.isLetter(c))
                            consonants++;
                    }

                    System.out.println("Words: " + words);
                    System.out.println("Vowels: " + vowels);
                    System.out.println("Consonants: " + consonants);
                    break;

                case 9:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 9);

        sc.close();
    }
}

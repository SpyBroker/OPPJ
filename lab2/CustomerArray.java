import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of objects
        Customer[] cust = new Customer[3];

        for (int i = 0; i < 3; i++) {
            cust[i] = new Customer();   // object creation

            System.out.println("\nEnter details of Customer " + (i + 1));

            System.out.print("Enter Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Customer Cell: ");
            String cell = sc.nextLine();

            System.out.print("Enter Customer Package: ");
            String pkg = sc.nextLine();

            System.out.print("Enter Customer Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // clear buffer

            cust[i].accept(name, cell, pkg, age);
        }

        System.out.println("\n===== CUSTOMER DETAILS =====");
        for (int i = 0; i < 3; i++) {
            cust[i].display();
        }

        sc.close();
    }
}

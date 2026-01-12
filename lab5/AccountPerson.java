import java.util.Scanner;

// Parent class
class Account {
    int accNo;
    double balance;

    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

// Child class
class Person extends Account {
    String name;
    long aadharNo;

    void input(Scanner sc) {
        System.out.print("Enter Name: ");
        sc.nextLine(); // consume newline
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadharNo = sc.nextLong();

        super.input(sc); // call Account input
    }

    @Override
    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadharNo);
        super.disp(); // call Account display
        System.out.println("-----------------------");
    }
}

// Main class
public class AccountPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] persons = new Person[3];

        System.out.println("Enter details of three persons\n");

        for (int i = 0; i < 3; i++) {
            System.out.println("Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input(sc);
        }

        System.out.println("\nDisplaying details of three persons\n");

        for (int i = 0; i < 3; i++) {
            persons[i].disp();
        }

        sc.close();
    }
}

package p6;
import java.util.Scanner;

abstract class Bank {
    abstract double getRateOfInterest();
}

class SBI extends Bank {

    @Override
    double getRateOfInterest() {
        return 7.5;
    }
}

class PNB extends Bank {

    @Override
    double getRateOfInterest() {
        return 8.0;
    }
}



public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the bank:\n1. SBI\n2. PNB");
        int choice = sc.nextInt();   // input mentioned in the program

        Bank b;

        if (choice == 1) {
            b = new SBI();
        } else {
            b = new PNB();
        }

        System.out.println("The rate of interest of the bank is " + b.getRateOfInterest());
        sc.close();
    }
}


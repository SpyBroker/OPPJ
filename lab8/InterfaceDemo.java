package p8;
import java.util.Scanner;

// Interface definition
interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

// Manager class (abstract because bonus() is not implemented)
abstract class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    // earnings method
    public void earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        double earnings = basic + da + hra;
        System.out.println("Earnings - " + (int) earnings);
    }

    // deductions method
    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deduction - " + (int) pf);
    }
}

// Substaff class extending Manager
class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    // bonus method implementation
    public void bonus() {
        double bonus = 0.50 * basic;
        System.out.println("Bonus - " + (int) bonus);
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);
        s.earnings();
        s.deductions();
        s.bonus();

        sc.close();
    }
}

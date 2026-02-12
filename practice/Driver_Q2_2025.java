
class BankAccount {
    int acc_num;
    String acc_holder_name;
    double balance;

    BankAccount(int accNo, String name, double bal) {
        acc_num = accNo;
        acc_holder_name = name;
        balance = bal;
    }

    double deposite(double amt){
        balance += amt;
        return balance;
    }

    double withdraw(double amt){
        balance -= amt;
        return balance;
    }
}

class SavingAccount extends BankAccount{

    SavingAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }
    
    void withdraw(int amt){
        if(balance-amt < 1000){
            System.out.println("Balance - " + balance);
            System.out.println("withdraw amt: "+ amt);
            System.out.println("Final balance less than 1000");
        } else {
            balance -=amt;
            System.out.println("Balance - " + balance);
        }
    }
}

class RecuringAccount extends BankAccount{

    RecuringAccount(int accNo, String name, double bal) {
        super(accNo, name, bal);
    }

    void withdraw(int amt){
        if(balance-amt < 2000){
            System.out.println("Balance - " + balance);
            System.out.println("withdraw amt: "+ amt);
            System.out.println("Final balance less than 2000");
        } else {
            balance -=amt;
            System.out.println("Balance - " + balance);
        }
    }
}
public class Driver_Q2_2025 {
    public static void main(String[] args){

        SavingAccount sa = new SavingAccount(101, "Rahul", 5000);
        RecuringAccount ra = new RecuringAccount(201, "Anita", 6000);

        System.out.println("\nSaving Account:");
        sa.withdraw(4500);

        System.out.println("\nRecurring Account:");
        ra.withdraw(4500);

    }

    
}

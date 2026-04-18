import java.util.Scanner;
class NegativeNumberException extends Exception{
    public NegativeNumberException(String message){
        super(message);
    }
}
public class NegNumEx {
    // static void ProcessInput(int n) throws NegativeNumberException{
    //     if(n<0)
    //         throw new NegativeNumberException("Entered number is negative.");
    //     else
    //         System.out.println("Result:" +n*2);
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try{
            if(n<0)
            {
                throw new NegativeNumberException("Negative number entered.");
            }
            else
                System.out.println("Result:" +n*2);
            // ProcessInput(n);
        }
        catch(NegativeNumberException e){
            // e.printStackTrace();
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
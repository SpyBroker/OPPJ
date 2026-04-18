class CheckArgumentException extends Exception {
    CheckArgumentException(String msg) {
        super(msg);
    }
}
public class Main {
    public static void main(String[] args) {

        try {
            // Check number of arguments
            if (args.length < 5) {
                throw new CheckArgumentException("Less than 5 arguments passed");
            }

            // Find largest among first 5 numbers
            int max = Integer.parseInt(args[0]);

            for (int i = 1; i < 5; i++) {
                int num = Integer.parseInt(args[i]);
                if (num > max) {
                    max = num;
                }
            }

            System.out.println("Largest number is: " + max);

        } catch (CheckArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers");
        }
    }
}
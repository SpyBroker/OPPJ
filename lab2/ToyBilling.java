import java.util.Scanner;

class ToyBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many toy details you want to accept? ");
        int n = sc.nextInt();

        Toy[] toys = new Toy[n];
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            toys[i] = new Toy();

            System.out.println("\nEnter details for Toy " + (i + 1));

            System.out.print("Enter Toy ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Enter Toy Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Toy Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter Toy Price: ");
            double price = sc.nextDouble();

            toys[i].acceptToy(id, name, qty, price);
            grandTotal += toys[i].getTotalPrice();
        }

        System.out.println("\n===== TOY BILL DETAILS =====");
        for (int i = 0; i < n; i++) {
            toys[i].displayToy();
        }

        System.out.println("Grand Total Billing Amount = " + grandTotal);
        sc.close();
    }
}

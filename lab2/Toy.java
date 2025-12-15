public class Toy {
    int toyId;
    String toyName;
    int toyQty;
    double toyPrice;

    // Method to accept toy details
    public void acceptToy(int id, String name, int qty, double price) {
        toyId = id;
        toyName = name;
        toyQty = qty;
        toyPrice = price;
    }

    // Method to calculate total price of a toy
    public double getTotalPrice() {
        return toyQty * toyPrice;
    }

    // Method to display toy details
    public void displayToy() {
        System.out.println("Toy ID     : " + toyId);
        System.out.println("Toy Name   : " + toyName);
        System.out.println("Toy Qty    : " + toyQty);
        System.out.println("Toy Price  : " + toyPrice);
        System.out.println("Total Amt  : " + getTotalPrice());
        System.out.println("---------------------------------");
    }
}
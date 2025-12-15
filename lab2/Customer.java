public class Customer {
    String name;
    String cell;
    String pkg;
    int age;

    // Method to accept customer details
    public void accept(String n, String c, String p, int a) {
        name = n;
        cell = c;
        pkg = p;
        age = a;
    }

    // Method to display customer details
    public void display() {
        System.out.println("Customer Name  : " + name);
        System.out.println("Customer Cell  : " + cell);
        System.out.println("Customer Pkg   : " + pkg);
        System.out.println("Customer Age   : " + age);
        System.out.println("--------------------------------");
    }
}

package p8;

// Interface definition
interface Demo {
    void show();
}

// Child class implementing interface
class Child implements Demo {

    public void show() {
        System.out.println("Show method from interface");
    }

    void display() {
        System.out.println("Display method of child class");
    }
}

// Main class
public class InterfaceRefDemo {
    public static void main(String[] args) {

        // Interface reference pointing to child class object
        Demo d = new Child();

        // Allowed: interface method
        d.show();

        // Not allowed: child class method
        // d.display();  // Compile-time error
    }
}

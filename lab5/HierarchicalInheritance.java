// Parent class
class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

// Child class 1
class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method");
    }
}

// Child class 2
class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

// Main class
public class HierarchicalInheritance {
    public static void main(String[] args) {

        // Dynamic Method Dispatch
        Apple ref;

        ref = new Apple();
        ref.show();

        ref = new Banana();
        ref.show();

        ref = new Cherry();
        ref.show();
    }
}

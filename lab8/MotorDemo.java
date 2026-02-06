package p8;

// Interface definition
interface Motor {
    int capacity = 5;   // public static final by default

    void run();
    void consume();
}

// Class implementing the interface
class WashingMachine implements Motor {

    public void run() {
        System.out.println("Washing machine is running");
    }

    public void consume() {
        System.out.println("Washing machine consumes electricity");
    }

    void displayCapacity() {
        System.out.println("Motor capacity is: " + capacity);
    }
}

// Main class
public class MotorDemo {
    public static void main(String[] args) {

        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        // Checking interface data member value
        System.out.println("Capacity through object: " + wm.capacity);
    }
}

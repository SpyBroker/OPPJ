// // Base class
// class AccessDemo {

//     // default access
//     int defaultVar = 10;

//     // public access
//     public int publicVar = 20;

//     // private access
//     private int privateVar = 30;

//     // protected access
//     protected int protectedVar = 40;

//     // static variable
//     static int staticCount = 0;

//     // final variable
//     final int finalValue = 100;

//     // constructor
//     AccessDemo() {
//         staticCount++;   // shared among all objects
//     }

//     // public method
//     public void show() {
//         System.out.println("Default: " + defaultVar);
//         System.out.println("Public: " + publicVar);
//         System.out.println("Private: " + privateVar);
//         System.out.println("Protected: " + protectedVar);
//         System.out.println("Final Value: " + finalValue);
//     }

//     // static method
//     static void showCount() {
//         System.out.println("Static Count: " + staticCount);  //staticCount increments for every object created
//     }
// }

// // Derived class
// class Child extends AccessDemo {

//     void display() {
//         System.out.println("Default: " + defaultVar);     // ✔ allowed
//         System.out.println("Public: " + publicVar);       // ✔ allowed
//         // System.out.println(privateVar);                // ❌ not allowed
//         System.out.println("Protected: " + protectedVar); // ✔ allowed
//     }
// }

// // Main class
// public class Main {
//     public static void main(String[] args) {

//         AccessDemo a1 = new AccessDemo();
//         AccessDemo a2 = new AccessDemo();

//         a1.show();
//         Child c = new Child();
//         c.display();

//         AccessDemo.showCount();  // static method call
//     }
// }


class Parent {

    // Default method (no access modifier)
    void defaultMethod() {
        System.out.println("Default method");
    }

    // Public method
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method");
    }

    // Final method
    final void finalMethod() {
        System.out.println("Final method (cannot be overridden)");
    }

    // Method to access private method
    void callPrivate() {
        privateMethod();
    }
}

class Child extends Parent {

    // Overriding allowed methods
    @Override
    public void publicMethod() {
        System.out.println("Overridden Public method");
    }

    @Override
    protected void protectedMethod() {
        System.out.println("Overridden Protected method");
    }

    // ❌ Not allowed
    /*
    void finalMethod() { }      // Cannot override final
    void privateMethod() { }    // Cannot override private
    static void staticMethod() {} // Static methods are hidden, not overridden
    */
}

public class Main {
    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        p.defaultMethod();
        p.publicMethod();
        p.callPrivate();
        p.protectedMethod();
        Parent.staticMethod();
        p.finalMethod();

        System.out.println("---- Child Object ----");

        c.defaultMethod();
        c.publicMethod();
        c.protectedMethod();
        c.finalMethod();
        Child.staticMethod();
    }
}

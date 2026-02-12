class A{
    void disp() {
        System.out.println("In A");
    }
}
class B extends A{
    void disp() {
        System.out.println("In B");
    }
}

public class dynamic_method {
    public static void main(String[] args) {
        // A ob1=new A();
        // B ob2 = new B();
        // A obj = ob1;
        // obj.disp(); // IN A
        // obj = ob2;
        // obj.disp(); // IN B
        A obj;
        obj = new A();
        obj.disp(); // IN A
        obj = new B();
        obj.disp(); // IN B
    }
}

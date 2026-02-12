// class test{
//     public static void main(String[] args) {
//         byte x=64;
//         int i;
//         byte y=(byte)(x<<2);
//         i=x<<2;
//         System.out.println(i+" "+y);
//     }
// }

abstract class Shape {

    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    // Abstract method
    abstract double area();

    // Concrete method
    void getColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {

    int radius;

    Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}

public class test{
    public static void main(String[] args) {
        Circle s = new Circle("Red", 5); // same as Shape s = new Circle("Red", 5);
        s.getColor();
        System.out.println("Area: " + s.area());
    }
}

// class Test {
// public static void main(String args[]) {
// float f=1.2f;
// boolean b=1;
// System.out.println(f) ;
// System.out.println(b);
// }}

// class test {
// public static void main(String args[]) {
// System.out.println(fun());
// }
// static int fun() {
// return 20;
// }}
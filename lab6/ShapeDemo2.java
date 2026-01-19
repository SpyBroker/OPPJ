abstract class Shape {
    abstract void calcArea();   // only method visible to reference
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calcArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    void circleInfo() {   // child-class own method
        System.out.println("This is a circle");
    }
}

public class ShapeDemo2 {
    public static void main(String[] args) {

        // Dynamic Polymorphism
        Shape s = new Circle(5);

        s.calcArea();        // ✅ allowed (Shape method)

        // s.circleInfo();   // ❌ NOT allowed
        // Compile-time error:
        // The method circleInfo() is undefined for the type Shape
    }
}

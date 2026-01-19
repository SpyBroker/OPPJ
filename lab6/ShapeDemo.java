package p6;

import java.util.Scanner;

abstract class Shape {
    abstract void calcArea();
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
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calcArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Shape s;

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                s = new Circle(r);
                s.calcArea();
                break;

            case 2:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                s = new Triangle(b, h);
                s.calcArea();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}


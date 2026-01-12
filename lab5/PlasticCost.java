import java.util.Scanner;

// Parent class (2D)
class Plastic2D {
    double costPerSqFt = 40;

    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    double calculate2DCost(double length, double breadth) {
        return calculateArea(length, breadth) * costPerSqFt;
    }
}

// Child class (3D) inheriting from 2D
class Plastic3D extends Plastic2D {
    double costPerCubicFt = 60;

    double calculateVolume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    double calculate3DCost(double length, double breadth, double height) {
        return calculateVolume(length, breadth, height) * costPerCubicFt;
    }
}

// Main class
public class PlasticCost {

    static double length, breadth, height, cost;

    static void takeDimensions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions:");
        System.out.print("Length: ");
        length = sc.nextDouble();

        System.out.print("Breadth: ");
        breadth = sc.nextDouble();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What do you want to buy? Press 1 for 2D box and 2 for 3D box:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                takeDimensions();

                Plastic2D sheet = new Plastic2D();
                cost = sheet.calculate2DCost(length, breadth);

                System.out.println("Cost of plastic sheet: Rs " + cost);

                break;
            case 2:
                takeDimensions();
                System.out.print("Height: ");
                height = sc.nextDouble();

                Plastic3D box = new Plastic3D();
                cost = box.calculate3DCost(length, breadth, height);

                System.out.println("Cost of plastic box: Rs " + cost);
                break;
            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        sc.close();
    }
}

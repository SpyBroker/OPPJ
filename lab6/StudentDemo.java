package p6;

abstract class Student {
    int rollNo;
    int regNo;

    void getInput(int rollNo, int regNo) {
        this.rollNo = rollNo;
        this.regNo = regNo;
    }

    abstract void course();
}


class Kiitian extends Student {

    @Override
    void course() {
        System.out.println("Course: B.Tech");
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Registration No: " + regNo);
        course();
    }
}


public class StudentDemo {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();

        k.getInput(115, 20240045);
        k.display();
    }
}

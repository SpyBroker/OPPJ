package Department;

public class Student_Q4b_2025 {
    String name;
    int sem;
    String brance;
    int roll_no;
    double cgpa;

    public Student_Q4b_2025(String name, int sem, String brance, int roll_no, double cgpa) {
        this.name = name;
        this.sem = sem;
        this.brance = brance;
        this.roll_no = roll_no;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sem);
        System.out.println("Branch: " + brance);
        System.out.println("Roll No: " + roll_no);
        System.out.println("CGPA: " + cgpa);
    }
}

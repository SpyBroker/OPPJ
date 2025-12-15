import java.util.*;
public class details
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter your name: ");
String name = sc.nextLine();
System.out.println("Enter your age: ");
int age = sc.nextInt();
System.out.println("Enter your salary: ");
int salary = sc.nextInt();

System.out.println("---------PERSONAL DETAILS--------");
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("Salary: "+salary);
}
}
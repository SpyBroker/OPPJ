import java.util.*;
public class Operations
{
int num1, num2, num3, ch;
Scanner sc=new Scanner(System.in);

public void menu()
{
System.out.println("1. Addition of two numbers");
System.out.println("2. Substraction of two numbers");
System.out.println("3. Multiplication of two numbers");
System.out.println("4. Division of two numbers");
System.out.println("5. Exit");
}

public void input()
{
System.out.println("Enter 1st number: ");
num1 = sc.nextInt();

System.out.println("Enter 2nd number: ");
num2 = sc.nextInt();
}

public void addition()
{
num3=num1+num2;
System.out.println(num3);
}

public void substraction()
{
num3=num1-num2;
System.out.println(num3);
}

public void multiplication()
{
num3=num1*num2;
System.out.println(num3);
}

public void division()
{
num3=num1/num2;
System.out.println(num3);
}

public static void main(String args[])
{
int x=1;
Operations obj = new Operations();
while(x==1)
// ...existing code...
{
    obj.menu();
    System.out.println("Enter your choice: ");
    obj.ch = obj.sc.nextInt();

    switch (obj.ch) {
        case 1 -> {
            obj.input();
            obj.addition();
        }
        case 2 -> {
            obj.input();
            obj.substraction();
        }
        case 3 -> {
            obj.input();
            obj.multiplication();
        }
        case 4 -> {
            obj.input();
            obj.division();
        }
        case 5 -> System.exit(0);
        default -> System.out.println("Invalid choice");
    }

    System.out.println("Do you want to continue, press(y=1/n=0)");
    x = obj.sc.nextInt();
}
}
}
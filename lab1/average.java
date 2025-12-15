import java.util.*;
public class average
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter marks in Subject 1: ");
int sub1 = sc.nextInt();

System.out.println("Enter marks in Subject 2: ");
int sub2 = sc.nextInt();

System.out.println("Enter marks in Subject 3: ");
int sub3 = sc.nextInt();

System.out.println("Enter marks in Subject 4: ");
int sub4 = sc.nextInt();

int avg = (sub1+sub2+sub3+sub4)/4;

System.out.println("Average is: "+avg);
}
}
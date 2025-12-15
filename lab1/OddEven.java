import java.util.*;
public class OddEven
{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

int n,odd=0,even=0,total=0;


for(int i=1;i<=10;i++)
{
System.out.println("Enter number "+i);
n=sc.nextInt();
if(n%2==0)
{
even += n;
}
else
{
odd +=n;
}

total+=n;
}

System.out.println("Even sum: "+even);
System.out.println("Odd sum: "+odd);
System.out.println("Grand Total: "+total);
}
}
import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row size: ");
        int n = sc.nextInt();
        System.out.println("Enter Column size: ");
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        System.out.println("Enter matrix elements: ");
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("------Printing Matrix Elements------");
        for(int i = 0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

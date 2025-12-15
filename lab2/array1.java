import java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of array inputs: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("------Printing Array Elements------");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\n");
    }
}

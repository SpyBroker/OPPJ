import java.util.Scanner;

class Q4a_2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter diff: ");
        int diff=sc.nextInt();

        arr[0]=first;

        for(int i=1;i<10;i++){
            arr[i]=arr[i-1]+diff;
        }

        for(int i=0;i<10;i++){
            System.out.print(arr[i]+" ");
        }
    }    
}

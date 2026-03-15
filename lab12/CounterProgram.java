package p12;
import java.util.Scanner;

class CounterThread extends Thread {
    int start, end;

    CounterThread(String name, int start, int end) {
        super(name);   // setting thread name
        this.start = start;
        this.end = end;
    }

    public void run() {
        try {
            for (int i = start; i <= end; i++) {
                System.out.println(getName() + " : " + i);
                Thread.sleep(5);  // gap of 5 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class CounterProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Thread Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Start Value: ");
        int start = sc.nextInt();

        System.out.print("Enter End Value: ");
        int end = sc.nextInt();

        CounterThread t = new CounterThread(name, start, end);
        t.start();   // start the thread
    }
}
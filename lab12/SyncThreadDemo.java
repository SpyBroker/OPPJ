package p12;
class Display {
    synchronized void printNumbers(String threadName) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    Display d;

    MyThread(Display d, String name) {
        this.d = d;
        setName(name);
    }

    public void run() {
        d.printNumbers(getName());
    }
}

public class SyncThreadDemo {
    public static void main(String args[]) {
        Display d = new Display();

        MyThread t1 = new MyThread(d, "Thread-1");
        MyThread t2 = new MyThread(d, "Thread-2");

        t1.start();
        t2.start();
    }
}
// class NewThread extends Thread {

// NewThread() {

// super("OddThread");

// System.out.println("Child thread: " + this);

// start();

// }

// public void run() {

// try {

// for (int i = 1; i < 10; i+=2) {

// System.out.println("Odd Thread: " + i);
// Thread.sleep(500);

// } }catch (InterruptedException e) {

// }

// System.out.println("Child interrupted.");


// System.out.println("Exiting child thread.");

// }
// }


// class Demo {

// public static void main(String args[]) {

// new NewThread();

// try {

// for (int i = 2; i < 10; i+=2) {

// System.out.println("Even Thread: " + i);

// Thread.sleep(500);

// }

// } catch (InterruptedException e) {

// System.out.println("Main thread interrupted.");

// }

// System.out.println("Main thread exiting.");

// }

// }

class NumberPrinter {
    int num = 1;
    int max = 10;
    boolean oddTurn = true;

    synchronized void printOdd() {
        while (num <= max) {
            while (!oddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {}
            }
            if (num <= max) {
                System.out.println("Odd Thread: " + num);
                num++;
                oddTurn = false;
                notify();
            }
        }
    }

    synchronized void printEven() {
        while (num <= max) {
            while (oddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {}
            }
            if (num <= max) {
                System.out.println("Even Thread: " + num);
                num++;
                oddTurn = true;
                notify();
            }
        }
    }
}

// Odd Thread
class OddThread extends Thread {
    NumberPrinter np;

    OddThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printOdd();
    }
}

// Even Thread
class EvenThread extends Thread {
    NumberPrinter np;

    EvenThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printEven();
    }
}

class Demo {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();

        OddThread t1 = new OddThread(np);
        EvenThread t2 = new EvenThread(np);

        t1.start();
        t2.start();
    }
}

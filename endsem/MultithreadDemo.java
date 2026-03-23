class MultiThreadDemo {

    // =========================
    // SHARED RESOURCE (for synchronization)
    // =========================
    static class Shared {

        synchronized void display(String msg) {
            // synchronized method → only one thread at a time
            System.out.print("[");
            try {
                Thread.sleep(500); // sleep()
            } catch (Exception e) {}
            System.out.println(msg + "]");
        }
    }

    // =========================
    // THREAD USING Runnable
    // =========================
    static class MyRunnable implements Runnable {

        Thread t;
        Shared s;
        String msg;

        // Constructor using Thread(Runnable, name)
        MyRunnable(Shared s, String name, String msg) {
            this.s = s;
            this.msg = msg;
            t = new Thread(this, name); // create thread
            t.start(); // start() → calls run()
        }

        public void run() {
            System.out.println("Running: " + Thread.currentThread().getName());

            s.display(msg);

            try {
                Thread.sleep(1000); // pause thread
            } catch (Exception e) {}

            System.out.println("Finished: " + Thread.currentThread().getName());
        }
    }

    // =========================
    // THREAD USING Thread CLASS
    // =========================
    static class MyThread extends Thread {

        Shared s;
        String msg;

        MyThread(Shared s, String name, String msg) {
            super(name); // setName via constructor
            this.s = s;
            this.msg = msg;
            start(); // start thread
        }

        public void run() {
            System.out.println("Running: " + getName());

            // synchronized block
            synchronized (s) {
                s.display(msg);
            }

            System.out.println("Finished: " + getName());
        }
    }

    // =========================
    // PRODUCER-CONSUMER
    // =========================
    static class Q {
        int n;
        boolean valueSet = false;

        synchronized int get() {
            while (!valueSet) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.println("Got: " + n);
            valueSet = false;
            notify(); // wake producer
            return n;
        }

        synchronized void put(int n) {
            while (valueSet) {
                try { wait(); } catch (Exception e) {}
            }
            this.n = n;
            System.out.println("Put: " + n);
            valueSet = true;
            notify(); // wake consumer
        }
    }

    static class Producer implements Runnable {
        Q q;

        Producer(Q q) {
            this.q = q;
            new Thread(this, "Producer").start();
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                q.put(i);
            }
        }
    }

    static class Consumer implements Runnable {
        Q q;

        Consumer(Q q) {
            this.q = q;
            new Thread(this, "Consumer").start();
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                q.get();
            }
        }
    }

    // =========================
    // MAIN METHOD (Main Thread)
    // =========================
    public static void main(String[] args) throws Exception {

        // MAIN THREAD INFO
        Thread mainThread = Thread.currentThread(); // currentThread()
        System.out.println("Main Thread: " + mainThread.getName());

        mainThread.setName("MainThread"); // setName()
        mainThread.setPriority(Thread.MAX_PRIORITY); // setPriority()

        System.out.println("Priority: " + mainThread.getPriority());

        // =========================
        // MULTIPLE THREADS
        // =========================

        Shared s = new Shared();

        MyRunnable r1 = new MyRunnable(s, "Thread1", "Hello");
        MyRunnable r2 = new MyRunnable(s, "Thread2", "World");

        MyThread t1 = new MyThread(s, "Thread3", "Java");

        // =========================
        // isAlive() & join()
        // =========================

        System.out.println("Thread1 alive: " + r1.t.isAlive());

        r1.t.join(); // wait for completion
        r2.t.join();

        System.out.println("After join Thread1 alive: " + r1.t.isAlive());

        // =========================
        // THREAD PRIORITIES
        // =========================

        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Thread3 Priority: " + t1.getPriority());

        // =========================
        // PRODUCER-CONSUMER
        // =========================

        Q q = new Q();

        new Producer(q);
        new Consumer(q);

        // allow time for threads to complete
        Thread.sleep(3000);

        System.out.println("Main thread exiting...");
    }
}
// class MyThread1 extends Thread{
//     public void run(){
//         System.out.println("Thread 1");
//     }
// }
// class MyThread2 extends Thread{
//     public void run(){
//         System.out.println("Thread 2");
//     }
// }
// class test1{
//     public static void main(String[] args) {
//         MyThread1 t1 = new MyThread1();
//         MyThread2 t2 = new MyThread2();
//         t1.start();
//         t2.start();
// }
// }

// class MyThread1 extends Thread{
//     public void run(){
//         for(int i=5; i>0; i--){
//             System.out.println("Thread 1: " + i);
//         }
//     }
// }
// class MyThread2 extends Thread{
//     public void run(){
//         for(int i=5; i>0; i--){
//             System.out.println("Thread 2: " + i);
//         }
//     }
// }
// class test1{
//     public static void main(String[] args) {
//         MyThread1 t1 = new MyThread1();
//         MyThread2 t2 = new MyThread2();
//         t1.start();
//         t2.start();
// }
// }

// class NewThread implements Runnable{
//     String name;
//     Thread t;
//     NewThread(String name){
//         this.name = name;
//         t = new Thread(this, name);
//         System.out.println("New thread: " +t);
//         t.start();
//     }
//     public void run(){
//         try{
//             for(int i=5; i>0; i--){
//                 System.out.println(name + ": " + i);
//                 Thread.sleep(1000);
//             }
//         } catch (InterruptedException e) {
//             System.out.println(name + " interrupted.");
//         }
//         System.out.println(name+" Exiting...");
//     }
// }

// class MultiThread{
//     public static void main(String[] args){
//         new NewThread("One");
//         new NewThread("Two");
//         new NewThread("Three");
//         try{
//             Thread.sleep(1000);
//         } catch(InterruptedException e){
//             System.out.println("Main thread interrupted");
//         }
//         System.out.println("Main thread exiting");
//     }
// }

// class NewThread implements Runnable {
// String name;
// Thread t;
// NewThread(String threadname) {
// name = threadname;
// t = new Thread(this, name);
// System.out.println("New thread: " + t);
// t.start();
// }
// public void run() {
// try {
// for (int i = 5; i > 0; i--) {
// System.out.println(name + ":" + i);
// Thread.sleep(1000);
// } }
// catch (InterruptedException e) {
// System.out.println(name + "Interrupted");
// System.out.println(name + " exiting.");
// }
// } }
// class test1 { //MultiThreadDemo 
// public static void main(String args[]) {
// NewThread ob1=new NewThread("One");
// NewThread ob2=new NewThread("Two");
// NewThread ob3=new NewThread("Three");
// System.out.println(ob1.t.isAlive());
// System.out.println(ob2.t.isAlive());
// System.out.println(ob3.t.isAlive());
// try {
// System.out.println("Waiting to finish.");
// ob1.t.join();
// ob2.t.join();
// ob3.t.join();
// } catch (InterruptedException e) {
// System.out.println("Main thread Interrupted");
// System.out.println(ob1.t.isAlive());
// System.out.println(ob2.t.isAlive());
// System.out.println(ob3.t.isAlive());    
// System.out.println("Main thread exiting.");
// }
// }
// }



class Callme {
synchronized void call(String msg) {
System.out.print("[" + msg);
try {
Thread.sleep(1000);
}
catch (InterruptedException e) {
System.out.println("Interrupted");
}
System.out.println("]");
} }
class Caller implements Runnable {
String msg;
Callme target;
Thread t;
public Caller(Callme targ, String s) {
target = targ;
msg = s;
t = new Thread(this);
t.start();
}
public void run() {
target.call(msg);
} }
class test1 { //Synch 
public static void main(String args[]) {
Callme target = new Callme();
Caller ob1 = new Caller(target, "Hello");
Caller ob2 = new Caller(target, "Synchronized");
Caller ob3 = new Caller(target, "World");
try {
ob1.t.join();
ob2.t.join();
ob3.t.join();
}
 catch (InterruptedException e) {
System.out.println("Interrupted");
}
}
}
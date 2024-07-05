package Threads;

class A extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("bye");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Threads1 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj2.start();
    }
}

class MyThread extends Thread {
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + " HEllO");
            i++;
        }
    }
}
public class thread_class_1 {
    public static void main(String[] args) {
        MyThread mt = new MyThread(); // Object is created...
        mt.start(); // Start method will call run method, it is inbuilt method in thread.
        int i = 1;
        while (true) {
            System.out.println(i + " WORLD");
            i++;
        }
    }
}
// Use thread class when we class is not extended, and you want to extend it.
// Use runnable class when class is already extended.
// run() method is the starting point of a thread.
// in thread class use extends.
// in runnable class use implements.





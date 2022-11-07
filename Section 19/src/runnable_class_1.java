class MyRunnable implements Runnable {
    public void run() {
        int i = 1;
        while(true) {
            System.out.println(i + " HEllO");
            i++;
        }
    }
}
public class runnable_class_1 {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread th = new Thread(mr);
        th.start();
        int i = 1;
        while (true) {
            System.out.println(i + " WORLD");
            i++;
        }
    }
}

public class runnable_class_2 implements Runnable {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " HEllO");
            i++;
        }
    }
    public static void main(String[] args) {
        runnable_class_2 rc = new runnable_class_2();
        Thread th = new Thread(rc);
        th.start();
        int i = 1;
        while (true) {
            System.out.println(i + " WORLD");
            i++;
        }
    }
}





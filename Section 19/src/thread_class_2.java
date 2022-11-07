public class thread_class_2 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " HEllO");
            i++;
        }
    }

    public static void main(String[] args) {
        thread_class_2 t = new thread_class_2();
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + " WORLD");
            i++;
        }
    }
}





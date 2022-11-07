class MyData
{
    public void Display(String str)
    {
        synchronized (this) { // using synchronization sleep method will also not work.
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
class MyThread1 extends Thread
{
    MyData d;
    public MyThread1(MyData d)
    {
        this.d=d;
    }
    public void run() {
        d.Display("Hello World ");
    }
}
class MyThread2 extends Thread
{
    MyData d;
    public MyThread2(MyData d)
    {
        this.d=d;
    }
    public void run() {
        d.Display("Welcome All");
    }
}
public class synchronization {
    public static void main(String[] args) {
        MyData d = new MyData();

        MyThread1 mt1 = new MyThread1(d);
        MyThread2 mt2 = new MyThread2(d);
        mt1.start();
        mt2.start();
    }
}


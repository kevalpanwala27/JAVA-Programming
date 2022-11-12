import java.io.*;

class Producer extends Thread
{
    OutputStream os;
    public Producer(OutputStream o)
    {
        os=o;
    }
    public void run() {
        int count = 1;
        while(true)
        {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer: " + count);
                System.out.flush();
                Thread.sleep(1000);
                count++;
            } catch (Exception e) {}
        }
    }
}

class Consumer extends Thread
{
    InputStream os;
    public Consumer(InputStream o)
    {
        os=o;
    }
    public void run() {
        int x;
        while(true)
        {
            try {
                x=os.read();
                System.out.println("Consumer: " + x);
                System.out.flush();
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
public class PipedStreams {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pos.connect(pis);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}

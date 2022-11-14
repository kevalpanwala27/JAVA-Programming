import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame14 extends Frame
{
    public MyFrame14()
    {
        super("Adapter Class Test");
        addWindowListener(new MyWindowAdapter());
    }
//    public MyFrame14()                      ////// WE CAN ALSO DO LIKE THIS !!!
//    {
//        super("Adapter Class Test");
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
//    }
    static class MyWindowAdapter extends WindowAdapter
    {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
public class Adapter_classes {
    public static void main(String[] args) {
        MyFrame14 mf14 = new MyFrame14();
        mf14.setLayout(new FlowLayout());
        mf14.setSize(500,500);
        mf14.setVisible(true);
    }
}

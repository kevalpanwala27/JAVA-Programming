import java.awt.*;

class MyFrame7 extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    public MyFrame7()
    {
        super("FlowLayout Test");
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");
        b6 = new Button("Six");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}
public class Flow_Layout {
    public static void main(String[] args) {
        MyFrame7 mf7 = new MyFrame7();
        mf7.setLayout(new FlowLayout());
        mf7.setSize(400,400);
        mf7.setVisible(true);
    }
}

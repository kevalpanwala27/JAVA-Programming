import java.awt.*;

class MyFrame9 extends Frame
{
    Button b1,b2,b3,b4,b5,b6;

    public MyFrame9()
    {
        super("GridLayout Test");
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
public class Grid_Layout {
    public static void main(String[] args) {
        MyFrame9 mf9 = new MyFrame9();
        mf9.setLayout(new GridLayout(3,2));
        mf9.setSize(400,400);
        mf9.setVisible(true);
    }
}

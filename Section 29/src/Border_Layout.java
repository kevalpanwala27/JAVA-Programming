import java.awt.*;

class MyFrame8 extends Frame
{
    Button b1,b2,b3,b4,b5;

    public MyFrame8()
    {
        super("BorderLayout Test");
        b1 = new Button("One");
        b2 = new Button("Two");
        b3 = new Button("Three");
        b4 = new Button("Four");
        b5 = new Button("Five");

        add(b1,BorderLayout.NORTH);
//        add(b2,BorderLayout.EAST);
        add(b3,BorderLayout.WEST);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.CENTER);

        Panel p = new Panel();
        p.setLayout(new GridLayout(3,1));
        p.add(new Button("Mon"));
        p.add(new Button("Tue"));
        p.add(new Button("Wed"));

        add(p,BorderLayout.EAST);
    }
}
public class Border_Layout {
    public static void main(String[] args) {
        MyFrame8 mf8 = new MyFrame8();
        mf8.setSize(400,400);
        mf8.setVisible(true);
    }
}

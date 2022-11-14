import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends Frame implements ActionListener
{
    int count = 0;
    Label l;
//    TextField tf; // Not needed, but for practice...
    Button b;
    public MyFrame1()
    {

        super("Button Test");
        l = new Label("     " + count);
        b = new Button("Click");
        b.addActionListener(this);


        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) { // This is a callBack method...
        count++;
        l.setText("     " + count);
    }
}



public class Button_and_actionListener {
    public static void main(String[] args) {
        MyFrame1 mf1 = new MyFrame1();
        mf1.setLayout(new FlowLayout());
        mf1.setSize(500,500);
        mf1.setVisible(true);
    }
}

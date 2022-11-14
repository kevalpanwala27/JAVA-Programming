// Typing form keyboard is also taken as an event.
// In TextField we are taking it as a Text Event.
// Upon frames key events can be handled.
// key events are generated upon frames.
// key pressed, key typed, and key released this all are different key events.


import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class MyFrame11 extends Frame implements KeyListener
{
    Label l1,l2,l3,l4;
    public MyFrame11() {
        super("KeyEvent Test");

        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        l1.setBounds(30,20,100,20);
        l2.setBounds(30,50,100,20);
        l3.setBounds(30,800,100,20);
        l4.setBounds(30,110,200,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed");
        l2.setText("");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l2.setText("Key released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l3.setText("Key Typed");
        l4.setText(String.valueOf(new Date(e.getWhen())));
    }
}
public class Handling_Key_Event {
    public static void main(String[] args) {
        MyFrame11 mf11 = new MyFrame11();
        mf11.setLayout(null);
        mf11.setSize(500,500);
        mf11.setVisible(true);
    }
}

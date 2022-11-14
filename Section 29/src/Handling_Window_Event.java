// Window activated, Window closed, Window closing, window deactivated,
// Window Deiconified, window Iconified, window Opened are different types of window event.

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyFrame13 extends Frame implements WindowListener
{
    Label l;
    public MyFrame13()
    {
        super("Window Event Test");
        l = new Label();
        add(l);

        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        l.setText("Window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        l.setText("Window closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        l.setText("Window closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        l.setText("Window iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        l.setText("Window deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        l.setText("Window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        l.setText("Window deactivated");
    }
}
public class Handling_Window_Event {
    public static void main(String[] args) {
        MyFrame13 mf13 = new MyFrame13();
        mf13.setLayout(new FlowLayout());
        mf13.setSize(500,500);
        mf13.setVisible(true);
    }
}

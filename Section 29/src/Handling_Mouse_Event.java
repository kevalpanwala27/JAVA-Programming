import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

// Mouse entered, Mouse Exited are different types of mouse events.
class MyFrame12 extends Frame implements MouseListener, MouseMotionListener
{
    Label l;
    public MyFrame12()
    {
        super("Mouse Event Test");
        l = new Label("");

        l.setBounds(10,50,100,20);
        add(l);

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Excited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved");
    }
}

public class Handling_Mouse_Event {
    public static void main(String[] args) {
        MyFrame12 mf12 = new MyFrame12();
        mf12.setLayout(null);
        mf12.setSize(500,500);
        mf12.setVisible(true);
    }
}

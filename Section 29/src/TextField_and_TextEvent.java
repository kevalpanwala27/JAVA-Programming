import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

class MyFrame3 extends Frame implements TextListener, ActionListener
{
    Label l1,l2;
    TextField tf;
    public MyFrame3()
    {
        super("TextField Test");
        l1 = new Label("No Text Entered, TextField is empty");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(20);

//        tf.setEchoChar('*'); // This is used for applications having password.
        tf.addTextListener(this);
        tf.addActionListener(this);


        add(l1);
        add(l2);
        add(tf);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        l1.setText(tf.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l2.setText(tf.getText());
    }
}
public class TextField_and_TextEvent {
    public static void main(String[] args) {
        MyFrame3 mf3 = new MyFrame3();
        mf3.setLayout(new FlowLayout());
        mf3.setSize(400,400);
        mf3.setVisible(true);
    }
}





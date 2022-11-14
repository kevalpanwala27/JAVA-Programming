import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame4 extends Frame implements ActionListener
{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;

    public MyFrame4()
    {
        super("TextArea Operations Test");
        ta = new TextArea(10,30);
        tf = new TextField(20);
        l = new Label("No Text Entered");
        b = new Button("Click");

        b.addActionListener(this); // it is given to button as whenever button will be clicked
//        then ActionListener will be handled.


        add(ta);
        add(tf);
        add(l);
        add(b);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        l.setText(ta.getSelectedText());
//        ta.append(tf.getText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }
}
public class TextArea_Operations {
    public static void main(String[] args) {
        MyFrame4 mf4 = new MyFrame4();
        mf4.setLayout(new FlowLayout());
        mf4.setSize(400,400);
        mf4.setVisible(true);
    }
}



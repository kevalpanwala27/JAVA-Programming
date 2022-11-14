import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame5 extends Frame implements ItemListener, ActionListener
{
    List l;
    Choice c;
    TextArea ta;

    public MyFrame5()
    {
        super("ListBox Test");
        l = new List(4,true);
        c = new Choice();
        ta = new TextArea(10,30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");
        c.add("May");
        c.add("June");
        c.add("July");
        c.add("August");
        c.add("September");
        c.add("October");
        c.add("November");
        c.add("December");



        l.addItemListener( this);
        c.addItemListener(this);
        l.addActionListener(this);



        add(l);
        add(c);
        add(ta);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==l)
            ta.setText(l.getSelectedItem());
        else
            ta.setText(c.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String List[] = l.getSelectedItems();
        String txt = " ";
        for (String x:List) {
            txt += x + "\n";
        }
        ta.setText(txt);
    }
}
public class ListBox_and_choice {
    public static void main(String[] args) {
        MyFrame5 mf5 = new MyFrame5();
        mf5.setLayout(new FlowLayout());
        mf5.setSize(400,400);
        mf5.setVisible(true);
    }
}

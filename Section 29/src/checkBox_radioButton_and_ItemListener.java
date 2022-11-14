import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame2 extends Frame implements ItemListener
{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cbg; // This is used for making radio buttons.
    public MyFrame2()
    {
        super("Check Box Test");
        l = new Label("Nothing is selected");

        cbg = new CheckboxGroup(); // For making radio buttons

        c1 = new Checkbox("Java", false,cbg); // When we are using radio buttons
        c2 = new Checkbox("Python",false,cbg); // When we are using radio buttons
        c3 = new Checkbox("C++",false,cbg); // When we are using radio buttons

//        c1 = new Checkbox("Java");
//        c2 = new Checkbox("Python");
//        c3 = new Checkbox("C++");

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        add(l);
        add(c1);
        add(c2);
        add(c3);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";
        if (c1.getState())
            str=str+" "+c1.getLabel();
        if (c2.getState())
            str=str+" "+c2.getLabel();
        if (c3.getState())
            str=str+" "+c3.getLabel();
        if (str.isEmpty())
            str="Noting is Selected";


        l.setText(str);
    }
}
public class checkBox_radioButton_and_ItemListener {
    public static void main(String[] args) {
        MyFrame2 mf2 = new MyFrame2();
        mf2.setLayout(new FlowLayout());
        mf2.setSize(500,500);
        mf2.setVisible(true);
    }
}

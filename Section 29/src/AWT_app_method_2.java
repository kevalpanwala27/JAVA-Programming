// IN METHOD TWO WE ARE WRITING OUR OWN CLASS SEPARATELY...
// THIS IS MOSTLY USED SO LEARN THIS...

import java.awt.*;
class MyFrame extends Frame
{
    Label l; // Only taking reference...
    TextField tf;
    Button b;

    public MyFrame() // Constructor is created...
    {
        super("My Frame"); // Title is done using super keyword...
        setLayout(new FlowLayout());


        l = new Label("Name"); // Creating all components that we want to add to frame.
        tf = new TextField(20);
        b = new Button("OK");

        add(l); // Adding all components that we added in the frame.
        add(tf);
        add(b);
    }
}
public class AWT_app_method_2 {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(300,300);
        mf.setVisible(true);
    }
}

// isA
// hasA
import java.awt.*;

public class AWT_app_method_1 {
    public static void main(String[] args) {

        Frame f = new Frame("My First App"); // First creat a frame and set the layout.
        f.setLayout(new FlowLayout());


        Button b = new Button("OK"); // Creating all components that we want to add to frame.
        Label l = new Label("Name: ");
        TextField tf = new TextField(20);


        f.add(l); // Adding all components that we added in the frame.
        f.add(tf);
        f.add(b);


        f.setSize(300,300); // setting size of the frame.
        f.setVisible(true); // Making it visible.
    }
}







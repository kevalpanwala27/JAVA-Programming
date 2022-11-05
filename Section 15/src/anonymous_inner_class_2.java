abstract class My {
    abstract public void show();
}
class outerrrr {
    public void display() {
        My m = new My() {
            @Override
            public void show() {
                System.out.println("Hello World!");
            }
        };
//        m.show();
    }
}

public class anonymous_inner_class_2 {
    public static void main(String[] args) {
        Outerrr o = new Outerrr();
        o.display();
    }
}

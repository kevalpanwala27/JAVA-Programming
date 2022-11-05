interface my {
    abstract public void show();
}
class outerrrrr {
    public void display() {
        my m = new my() {
            @Override
            public void show() {
                System.out.println("Hello World to Keval!");
            }
        };
        m.show();
    }
}

public class anonymous_inner_class_3 {
    public static void main(String[] args) {
        Outerrr o = new Outerrr();
        o.display();
    }
}




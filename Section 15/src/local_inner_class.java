class Outerr {
    public void display() {
        class Inner {
            public void Show() {
                System.out.println("Hello");
            }
        }
        Inner i = new Inner();
        i.Show();
    }
}
public class local_inner_class {
    public static void main(String[] args) {
        Outerr o = new Outerr();
        o.display();
    }
}

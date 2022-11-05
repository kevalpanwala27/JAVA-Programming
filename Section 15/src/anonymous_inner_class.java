class Outerrr {
    public void display() {
        class Inner {
            public void Show() {
                System.out.println("Hello, Keval");
            }
        }
        new Inner().Show(); // anonymous inner class.
    }
}

public class anonymous_inner_class {
    public static void main(String[] args) {
        Outerrr o = new Outerrr();
        o.display();
    }
}

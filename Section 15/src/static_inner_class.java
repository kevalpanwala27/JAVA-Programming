class Outer {
    int x=10;
    static int y=20;
    static class My {
        public void show() {
//            System.out.println(x + " " + y); // as Non-static member cannot be accessed.
            System.out.println(y);
        }
    }
}
public class static_inner_class {
    public static void main(String[] args) {
        Outer.My m=new Outer.My();
        m.show();
    }
}




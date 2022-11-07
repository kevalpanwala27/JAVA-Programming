class Test { // We cannot make outer class as static. // only inner classes can be made as static.
    static int x = 10;
    int y = 20; // This should be static to access static display method.
    void show() {
        System.out.println(x + " " + y);
    }
/*
    static void display() { // Non-static members cannot access static members.
        System.out.println(x + " " + y);
    }
*/
    static void display() {
        System.out.println(x);
    }
}
public class static_members {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.show();
        t1.x = 30; // We can change value like this!
        t1.y = 50;

        Test t2 = new Test();
        t2.show();
    }
}




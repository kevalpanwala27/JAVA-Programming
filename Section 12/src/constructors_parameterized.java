class parents {
    parents() {
        System.out.println("Non-Param of parent");
    }
    parents(int x) {
        System.out.println("Param of parent "+x);
    }
}

class children extends parents {
    children() {
        System.out.println("Non-Param of child");
    }
    children(int y) {
        System.out.println("Param of child");
    }
    children(int x,int y) {
        super(x); // Calling of parent class constructor.
        System.out.println("2 param of child "+y);
    }
}

public class constructors_parameterized {
    public static void main(String[] args) {
        children c = new children();
        System.out.println();
        children c1 = new children(20);
        System.out.println();
        children c2 = new children(10,20);
    }
}

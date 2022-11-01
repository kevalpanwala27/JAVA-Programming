// Calling a static method to non-static method.

public class static_nonStatic {
    // Writing a method...
    int max(int x, int y) {
        if (x>y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        int a=10,b=15;
        // Learning how to call non-static method to a static method.
        // Class_name any_name = new Class_name();
        static_nonStatic snc = new static_nonStatic();
        System.out.println(snc.max(a,b)); // Calling of method.
    }
}


public class pass_by_value {
// Writing a method...
    static void inc(int x) {
        x++;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int a = 10, b = 15;
        inc(a); // Calling a method.
        System.out.println(a);
        // Value in main method will does not affect if we change value in the method that we created.
    }
}

// hence we can say that, actual parameter values will only get copied in formal parameters,
// it will not change the value.
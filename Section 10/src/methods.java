public class methods {
// Writing a method...
    static int max(int x, int y) { // This we called as formal parameters.
        if (x>y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        int a=15, b=10; // giving parameters. // This we called as Actual parameters.
        System.out.println(max(a,b)); // Calling of method.
    }
}

//NOTE:- It is not showing an error as static methods can call static method only.
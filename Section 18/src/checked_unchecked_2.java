// Lets handle it... using try and catch block.
public class checked_unchecked_2 {
    static void fun1() {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
//            e. // Exceptions methods can be called.
            System.out.println(e.getMessage());
            e.printStackTrace(); // It will show the path... // Sequence
        }
    }
    static void fun2() {
        fun1();
    }
    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}



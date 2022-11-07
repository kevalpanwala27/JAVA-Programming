public class checked_unchecked {
    static void fun1() {
        System.out.println(10/0); // This comes under unchecked exceptions.
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
// Must handle them using try and catch block. - checked exceptions
// runtime exceptions are. - unchecked exceptions. if we want to handle then handle it or leave it.
// it's not mandatory.


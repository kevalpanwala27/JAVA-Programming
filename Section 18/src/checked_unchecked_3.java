// Watching of checked exception...
import java.io.*;
public class checked_unchecked_3 {
    static void fun1() {
//        FileInputStream fi = new FileInputStream("My.txt"); // This shows checked exception.
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




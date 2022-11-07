// Use of try and catch block...
import java.util.Scanner;

public class try_catch_block {
    public static void main(String[] args) {
//        int a=10, b=0, c; // value taken by us.
        // Trying using scanner.
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        try {
            c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator should not be 0, try again"); // This is our own message
            System.out.println(e); // Compiler message. // error message.
        }
        System.out.println("Hello World!");
    }
}
// Bad inputs and unavailability of resources - These are exceptions.
//  are runtime errors.(users)
// syntax errors and logical errors.(Programmers)
// Syntax error are solved by compiler.
// Logical error are solved by tracing/debugger.



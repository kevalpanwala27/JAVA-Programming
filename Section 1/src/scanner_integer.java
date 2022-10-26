// Printing integer using scanner.
import java.util.Scanner;

public class scanner_integer {
    public static void main(String[] args) {
        System.out.println("Enter your numbers a and b: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.print("Sum is: " + c);
    }
}

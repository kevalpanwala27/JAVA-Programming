// Printing string using scanner.
import java.util.Scanner;

public class scanner_string {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Welcome: " + str);
    }
}

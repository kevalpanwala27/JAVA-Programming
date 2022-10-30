// Loops practice.
import java.util.Scanner;

public class std_chlg_factorial {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of " + n + " number is " + fact);
    }
}





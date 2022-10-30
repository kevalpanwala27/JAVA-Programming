// Loops practice.
import java.util.Scanner;

public class std_chlg_palindrome {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n;
        int reverse = 0;
        int r;
        while (n>0) {
            r=n%10;
            n=n/10;
            reverse = reverse * 10 + r;
        }
        if (reverse == m) {
            System.out.println("This is a palindrome number");
        }else
            System.out.println("This is not a palindrome number");
    }
}



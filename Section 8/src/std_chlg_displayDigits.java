// Loops practice.
import java.util.Scanner;

public class std_chlg_displayDigits {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        while (n>0) {
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
}




// Loops practice.
import java.util.Scanner;

public class std_chlg_armstrong {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int m=n;
        int r;
        while (n>0) {
            r=n%10;
            n=n/10;
            sum = sum + r*r*r;
        }
        if (m==sum)
            System.out.println("This is an Armstrong number");
        else
            System.out.println("This is not N Armstrong number");
    }
}




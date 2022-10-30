// Fibonacci series.
import java.util.Scanner;

public class std_chlg_fibonacci {
    public static void main(String[] args) {
        System.out.println("Program to print fibonacci series");
        System.out.println("Enter number of terms");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a=0, b=1, c;
        System.out.println(a+","+b);
        for (int i = 0; i < n-2; i++) {
            c = a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}





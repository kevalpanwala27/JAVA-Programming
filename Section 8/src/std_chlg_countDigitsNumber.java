// Loops practice.
import java.util.Scanner;

public class std_chlg_countDigitsNumber {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (n>0) {
            n=n/10;
            i++;
        }
        System.out.println(i);
    }
}




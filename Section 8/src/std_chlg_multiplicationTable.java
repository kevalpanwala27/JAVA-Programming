// Loops practice.
import java.util.Scanner;

public class std_chlg_multiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i<=10; i++) {
            System.out.println(n + "x" + i + "=" + n*i);
        }
    }
}

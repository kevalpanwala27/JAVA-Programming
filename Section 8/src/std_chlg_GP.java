// Geometric practice.
import java.util.Scanner;

public class std_chlg_GP {
    public static void main(String[] args) {
        System.out.println("program to print GP series");
        System.out.println("Enter a, r, and n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        int term = a;
        for (int i = a; i < n; i++) {
            System.out.println(term);
            term = term * r;
        }
    }
}

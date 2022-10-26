// Student challenge - Quadratic equation.
import java.util.Scanner;

public class std_chlg_quadratic_eqn {
    public static void main(String[] args) {
        System.out.println("Enter values of a, b and c: ");
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double x, y;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        x = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        y = (-b-Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.print("Roots are " + x + " " + y);
    }
}

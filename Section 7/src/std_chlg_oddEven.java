// Conditionals statements practice.
import java.util.Scanner;

public class std_chlg_oddEven {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println("This is an even number");
        else
            System.out.println("This is an odd number");
    }
}




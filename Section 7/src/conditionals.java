// Conditionals statements practice.
import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        if (n>0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
}




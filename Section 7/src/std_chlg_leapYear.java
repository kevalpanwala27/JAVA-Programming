// Conditionals statements practice.
import java.util.Scanner;

public class std_chlg_leapYear {
    public static void main(String[] args) {
        System.out.print("Enter year number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.println("This is a leap year");
                } else {
                    System.out.println("This is not a leap year");
                }
            } else {
                System.out.println("This is a leap year");
            }
        } else {
            System.out.println("This is a leap year");
        }
    }
}






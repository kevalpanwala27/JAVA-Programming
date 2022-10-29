// Conditionals statements practice.
import java.util.Scanner;

public class std_chlg_dayNumber {
    public static void main(String[] args) {
        System.out.print("Enter day number: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        if (day == 1) {
            System.out.print("MONDAY");
        } else if (day == 2) {
            System.out.print("TUESDAY");
        } else if (day == 3) {
            System.out.print("WEDNESDAY");
        } else if (day == 4) {
            System.out.print("THURSDAY");
        } else if (day == 5) {
            System.out.print("FRIDAY");
        } else if (day == 6) {
            System.out.print("SATURDAY");
        } else if (day == 7) {
            System.out.print("SUNDAY");
        } else
            System.out.print("Invalid Number");
    }
}



// Conditionals statements practice.
import java.util.Scanner;

public class std_chlg_dayNumber_switchCase {
    public static void main(String[] args) {
        System.out.print("Enter your day number: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.print("MONDAY");
            case 2 -> System.out.print("TUESDAY");
            case 3 -> System.out.print("WEDNESDAY");
            case 4 -> System.out.print("THURSDAY");
            case 5 -> System.out.print("FRIDAY");
            case 6 -> System.out.print("SATURDAY");
            case 7 -> System.out.print("SUNDAY");
            default -> System.out.print("Invalid Number");
        }
    }
}




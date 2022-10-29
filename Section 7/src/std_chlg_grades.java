// Conditionals statements practice.
import java.util.Scanner;

public class std_chlg_grades {
    public static void main(String[] args) {
        System.out.print("Enter your marks: ");
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int total_marks = m1 + m2 + m3;
        int average_marks = total_marks/3;

        if (average_marks > 70)
            System.out.println("You have A grade");
        else if (average_marks < 70 && average_marks > 50) {
            System.out.println("You have B grade");
        } else
            System.out.println("You have C grade");
    }
}




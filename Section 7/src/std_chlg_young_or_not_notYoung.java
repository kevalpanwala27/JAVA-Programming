// Conditionals statements practice.
import java.util.Scanner;

public class std_chlg_young_or_not_notYoung {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=14 && n<=55)
            System.out.println("You are young");
        else
            System.out.println("You are not young");
    }
}




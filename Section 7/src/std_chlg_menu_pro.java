// Practice switch statements.
import java.util.Scanner;

public class std_chlg_menu_pro {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter 2 Numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        sc.nextLine(); // REM !!!
        System.out.println("Enter Option in Words ");
        String option=sc.nextLine();
        option=option.toUpperCase();

        switch (option) {
            case "ADD" -> System.out.println("Sum is " + (x + y));
            case "SUB" -> System.out.println("Difference is " + (x - y));
            case "MUL" -> System.out.println("Product is " + (x * y));
            case "DIV" -> System.out.println("Ratio is " + (x / y));
            default -> System.out.println("Invalid Option");
        }
    }
}



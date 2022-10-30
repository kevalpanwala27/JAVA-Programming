// Loops practice.
import java.util.Scanner;

public class std_chlg_displayNumberInWords {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        String str = " ";

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            str = str + r;
        }
        System.out.println(str);
        char c;

        for (int i = str.length() - 1; i >= 0; i--) {
            c = str.charAt(i);
            switch (c) {
                case '0' -> System.out.print("ZERO");
                case '1' -> System.out.print("ONE");
                case '2' -> System.out.print("TWO");
                case '3' -> System.out.print("THREE");
                case '4' -> System.out.print("FOUR");
                case '5' -> System.out.print("FIVE");
                case '6' -> System.out.print("SIX");
                case '7' -> System.out.print("SEVEN");
                case '8' -> System.out.print("EIGHT");
                case '9' -> System.out.print("NINE");
            }
            System.out.print(" ");
        }
    }
}



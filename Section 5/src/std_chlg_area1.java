// Student challenge - calculate area.
import java.util.Scanner;

public class std_chlg_area1 {
    public static void main(String[] args) {
        int a, b, c;
        float s, area;
        System.out.println("Enter 3 sides of a triangle: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a+b+c)/2f;
        area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of triangle is: " + area);
    }
}

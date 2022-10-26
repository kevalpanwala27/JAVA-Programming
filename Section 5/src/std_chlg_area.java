// Student challenge - calculate area.
import java.util.Scanner;

public class std_chlg_area {
    public static void main(String[] args) {
        float base, height, area;
        System.out.print("Enter base and height: ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = 1f/2f*base*height;
        System.out.println("Area of triangle is: " + area);
    }
}

// Student challenge - cuboid.
import java.util.Scanner;

public class std_chlg_cuboid {
    public static void main(String[] args) {
        int length, breadth, height;
        int total_area, volume;
        System.out.println("Enter length, breadth and height: ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();

        total_area = 2*(length*breadth + breadth*height + height*length);
        volume = length*breadth*height;

        System.out.print("Total area of cuboid is: " + total_area);
        System.out.println();
        System.out.print("Total volume of cuboid is: " + volume);
    }
}


import java.util.Scanner;

class Cylinder {
    public double radius;
    public double height;

    public double lidArea() {
        return Math.PI * radius * radius;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }
    public double volume() {
        return lidArea() * height;
    }
}
public class class_cylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        System.out.print("Enter height and radius: ");
        Scanner sc = new Scanner(System.in);
        c.height = sc.nextInt();
        c.radius = sc.nextInt();

        System.out.println("Lid Area is: " + c.lidArea());
        System.out.println("Circumference is: " + c.circumference());
        System.out.println("Total surface area is: " + c.totalSurfaceArea());
        System.out.println("Volume is: " + c.volume());
    }
}

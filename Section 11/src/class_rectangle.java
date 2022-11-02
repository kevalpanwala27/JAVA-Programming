import java.util.Scanner;

class Rectangle {
    public double length; // Properties
    public double breadth; // Properties

    public double area() {
        return length * breadth; // Method
    }
    public double perimeter() {
        return 2*(length + breadth); // Method
    }
    public boolean isSquare() {
        return length==breadth; // Method
    }
}

public class class_rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(); // Creating object of class
        System.out.print("Enter length and breadth: ");
        Scanner sc = new Scanner(System.in);
        r.length = sc.nextInt(); // Calling method
        r.breadth = sc.nextInt(); // Calling method

        System.out.println("Area is: " + r.area()); // Calling method
        System.out.println("Perimeter is: " + r.perimeter()); // Calling method
        System.out.println("is Square: " + r.isSquare()); // Calling method
    }
}


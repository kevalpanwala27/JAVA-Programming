import java.util.Scanner;

class Circle {
    public double radius; // Properties
    public double area() {
        return Math.PI * radius * radius; // Method
    }
    public double circumference() {
        return 2 * Math.PI * radius; // Method
    }
    public double perimeter() {
        return circumference(); // Method
    }
}

public class class_circle {
    public static void main(String[] args) {
        System.out.print("Enter your radius for n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Circle c = new Circle(); // Creating object of class.
        Circle c1 = new Circle();
        c.radius=n; // Calling method
        System.out.println("Circumference is: " + c.circumference()); // Calling method
        System.out.println("Area is: " + c.area()); // Calling method
        System.out.println("Perimeter is: " + c.perimeter()); // Calling method

        System.out.println();

        System.out.print("Enter your radius for n1: ");
        int n1 = sc.nextInt();
        c1.radius=n1; // Calling method
        System.out.println("Circumference is: " + c1.circumference()); // Calling method
        System.out.println("Area is: " + c1.area()); // Calling method
        System.out.println("Perimeter is: " + c1.perimeter()); // Calling method
    }
}

// Abstraction - Hiding internal details and showing only required features.
// Encapsulation - everything inside, like a capsule.
// Inheritance - Reusing the old code and making of new code with extra features.
// Specialization means Inheritance.
// Generalization means Polymorphism.
// Polymorphism - Collecting many things under one term. //ex:- TV-> Samsung, LG, Sony etc

 /* SYNTAX FOR WRITING A CLASS...
 Class Class_name {
    Properties
    Methods
 }
*/




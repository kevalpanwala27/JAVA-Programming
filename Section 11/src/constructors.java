// Every class in java will have default constructor.
// Constructor will have name same as class_name.
// Constructor will not have any return type.
class Rectangle2 {
    private double length;
    private double breadth;

    // CALLING CONSTRUCTORS
    public Rectangle2() { // NON PARAMETERIZED CONSTRUCTOR
        length=1;
        breadth=1;
    }
    public Rectangle2(double l, double b) {
        length=l;
        breadth=b;
    }
    public Rectangle2(double s) {
        length=breadth=s;
    }
    public double area() {
        return length * breadth; // Method
    }
}

public class constructors {
    public static void main(String[] args) {
        Rectangle2 r2 = new Rectangle2(); // r2 = reference of an object of a class. // Calling of NON PARAMETERIZED CONSTRUCTOR.
        Rectangle2 R2 = new Rectangle2(10,5); // r2 = reference of an object of a class. // Calling of PARAMETERIZED CONSTRUCTOR.
        System.out.println("Area is: " + r2.area());
        System.out.println("Area is: " + R2.area());
    }
}

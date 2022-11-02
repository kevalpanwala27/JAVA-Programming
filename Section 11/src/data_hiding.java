// Get- Set method.
// Example - Rectangle class
// For data hiding change public to private.

// set method have write properties.
// get method have read properties.

class rectangle1 {
    private double length; // Properties
    private double breadth; // Properties

    // WRITING GETTER AND SETTER METHODS.
    // GETTER METHODS.
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    // SETTER METHODS.
    public void setLength(double l) {
        length = l;
    }
    public void setBreadth(double b) {
        breadth = b;
    }
    // SIMPLE METHODS.
    public double area() {
        return getLength() * getBreadth(); // Method
    }
    public double perimeter() {
        return 2 * (getLength() + getBreadth()); // Method
    }
    public boolean isSquare() {
        return getLength() == getBreadth(); // Method
    }
}

public class data_hiding {
    public static void main(String[] args) {
        rectangle1 x = new rectangle1(); // Creating object of class
        x.setLength(10.5); // Calling of set method.
        x.setBreadth(5.5); // Calling of set method.

        System.out.println("Area is: " + x.area()); // Calling method
        System.out.println("Perimeter is: " + x.perimeter()); // Calling method
        System.out.println("is Square: " + x.isSquare()); // Calling method
        System.out.println("Length is: " + x.getLength()); // Calling of get method.
        System.out.println("Breadth is: " + x.getBreadth()); // Calling of get method.
    }
}




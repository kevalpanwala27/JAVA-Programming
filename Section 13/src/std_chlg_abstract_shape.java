abstract class Shape {
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape {
    public double radius;
    @Override
    public double perimeter() { // method overriding
        return 2*Math.PI*radius;
    }
    @Override
    public double area() { // method overriding
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape {
    public double length;
    public double breadth;
    @Override
    public double perimeter() { // method overriding
        return 2*(length+breadth);
    }
    @Override
    public double area() { // method overriding
        return length*breadth;
    }
}

public class std_chlg_abstract_shape {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length=10;
        r.breadth=5;
        System.out.println("Area is: " + r.area());
        System.out.println("Perimeter is: " + r.perimeter());
    }
}



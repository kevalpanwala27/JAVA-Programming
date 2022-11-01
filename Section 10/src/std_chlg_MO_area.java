public class std_chlg_MO_area {

    static double area(double radius) {
        return Math.PI*radius*radius;
    }

    static double area(double length,double breadth) {
        return length*breadth;
    }
    public static void main(String[] args) {
        System.out.print("Area of circle is: " + area(5));
        System.out.println();
        System.out.print("Area of rectangle is: " + area(10,5));
    }
}



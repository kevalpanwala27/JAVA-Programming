class cylinder {
    private double radius;
    private double height;
    public cylinder() {
        radius = 5;
        height = 10;
    }
    public cylinder(int r) {
        radius = r;
    }
    public cylinder(int r, int h) {
        radius = r;
        height = h;
    }
    public double getRadius() {
        return radius;
    }
    public double getHeight() {
        return height;
    }
    public void setRadius(double r) {
        radius = r;
    }
    public void setHeight(double h) {
        height = h;
    }
    public void setDimensions(double r, double h) {
        radius = r;
        height = h;
    }
}

public class constructors_cylinder {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        cylinder c1 = new cylinder(7);
        cylinder c2 = new cylinder(7,14);
    }
}




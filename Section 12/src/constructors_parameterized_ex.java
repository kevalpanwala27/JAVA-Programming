class Rectangle {
    public int length;
    public int breadth;

    public Rectangle() {
        length=breadth=1;
    }
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}
class cuboid extends Rectangle {
    public int height;
    public cuboid() {
        height = 1;
    }
    public cuboid(int h) {
        height = h;
    }
    public cuboid(int l, int b, int h) {
        super(l,b);
        height = h;
    }
    public int volume() {
        return length*breadth*height;
    }
}
public class constructors_parameterized_ex {
    public static void main(String[] args) {
        cuboid c = new cuboid();
        System.out.println(c.volume());
        cuboid c1 = new cuboid(20);
        System.out.println(c1.volume());
        cuboid c2 = new cuboid(10,20,30);
        System.out.println(c2.volume());
    }
}


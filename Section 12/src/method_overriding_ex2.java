class Car {
    public void start() {
        System.out.println("Car Started");
    }
    public void accelerate() {
        System.out.println("Car is Accelerated");
    }
    public void changeGear() {
        System.out.println("Car Gear Changed");
    }
}
class luxuryCar extends Car {
    public void changeGear() {
        System.out.println("Automatic Gear");
    }
    public void openRoof() {
        System.out.println("Sun Roof is Opened");
    }
}
public class method_overriding_ex2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.changeGear();
        c.accelerate();
        c.start();
        System.out.println();
        luxuryCar lc = new luxuryCar();
        lc.changeGear();
        lc.openRoof();
        lc.start();
        lc.accelerate();
        System.out.println();
        Car ca=new luxuryCar();
        ca.start();
        ca.accelerate();
        ca.changeGear();
    }
}


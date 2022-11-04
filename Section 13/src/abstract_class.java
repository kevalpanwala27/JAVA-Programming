abstract class Super {
    public Super() {
        System.out.println("Super Constructor");
    }
    public void meth1() {
        System.out.println("Meth1 of Super");
    }
    abstract public void meth2();
}
// If a class having abstract method then the class must be declared as abstract class.
class sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub meth2"); // After overriding now, we can create objects in main method.
    }
}
public class abstract_class {
    public static void main(String[] args) {
//        Super su = new Super(); // As abstract class cannot create object.
        sub s = new sub();
        s.meth1(); // so we can call method also.
        s.meth2(); // so we can call methods also.
        System.out.println();
        Super sp = new sub(); // we can use dynamic method dispatch also.
        sp.meth1(); // so we can call methods also.
        sp.meth2(); // so we can call methods also.
    }
}

// In abstract classes we cannot create the object of the classes.
// Although we can create a reference in the abstract class.
// a method not having body like no flower brackets... // Undefined method. // there is no definition a method.
// a class which is having at least one abstract method. // Then definitely that class is an abstract class.
// i.e. the class is not completely defined.
// Hence, a class can have zero or more than zero abstract method.
// Abstract classes are useful for defining standards and imposing standards.
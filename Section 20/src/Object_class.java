// Object class is a mother of all classes.
public class Object_class {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
//        o1. // Methods can be called.
        System.out.println(o1); // toString method will be called.
        System.out.println(o1.equals(o2)); // it will compare it. // It will print false unless we do
        // like this Object o2 = o1.

        // Every class directly/indirectly inheriting from the object class.

        // toString method, Hashcode method, equals method can be overrided.
        // Commonly we override toString() method.
    }
}




interface Test {
    void meth1();
    void meth2();
}
class My implements Test {
    @Override
    public void meth1() {
        System.out.println("Meth1 of class My");
    }
    @Override
    public void meth2() {
        System.out.println("Meth2 of class My");
    }
    public void meth3() {
        System.out.println("Meth3 of class My");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Test t = new My();
        t.meth1();
        t.meth2();
        System.out.println();
        My m = new My();
        m.meth1();
        m.meth2();
        m.meth3();
    }
}




// Abstract class is converted in interfaces.
// Interfaces are implemented.
// so interface is abstract class with all abstract methods.
// using interface, run time polymorphism can be achieved.

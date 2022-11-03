class Superr {
    public void meth1() {
        System.out.println("Superr meth1");
    }
    public void meth2() {
        System.out.println("Superr meth2");
    }
}
class Subb extends Superr {
    @Override
    public void meth2() {
        System.out.println("Superr meth2");
    }
    public void meth3() {
        System.out.println("Subb meth3");
    }
}
public class dynamic_method_dispatch {
    public static void main(String[] args) {
        Superr su =  new Superr();
        su.meth1();
        su.meth2();
        System.out.println();
        Subb sb = new Subb();
        sb.meth1();
        sb.meth2();
        sb.meth3();
        System.out.println();
        Superr s = new Subb();
        s.meth1();
        s.meth2();
    }
}

// polymorphism - one name, different actions.
// method overloading - compile time polymorphism.
// method overriding - run time polymorphism.



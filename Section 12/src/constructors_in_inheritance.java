class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }

}
class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }
}
class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grand Child Constructor");
    }
}
public class constructors_in_inheritance {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println();
        Child c = new Child();
        System.out.println();
        GrandChild gc = new GrandChild();
    }
}

class Super {
    public void display() {
        System.out.println("Super Display");
    }
}

class Sub extends Super {
    @Override
    public void display() {
        System.out.println("Sub Display");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        Super su = new Super();
        su.display();
        Sub sb = new Sub();
        sb.display();
        Super sp = new Sub();
        sp.display();
    }
}



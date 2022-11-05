class outer {
    static int x = 10; // we can write static and non-static as per our choice.
    class inner {
        int y = 20;
        public void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }
    public void outerDisplay() {
        inner i = new inner();
        i.innerDisplay();
//        System.out.println(y); // Error is shown // y should bwe in outer class.
        System.out.println(i.y);
    }
}
public class nested_inner_class {
    public static void main(String[] args) {
        outer o = new outer();
        o.outerDisplay();

        outer.inner oi = new outer().new inner(); // For direct accessing the inner class
        oi.innerDisplay();
    }
}
// Inner class can access the variables values of outer class.





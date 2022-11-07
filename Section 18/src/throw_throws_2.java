// Using of throw and throws keywords.
public class throw_throws_2 {
    static int area(int l, int b) throws Exception {
        if (l < 0 || b < 0)
            throw new Exception();
        return l * b;
    }

    static void meth1() throws Exception {
        System.out.println("Area is: " + area(10, 5));
    }

    //    public static void main(String[] args) throws Exception {
//        meth1(); // We can remove throws exception as we can handle it by try and catch block.
//      }
    public static void main(String[] args) { // Handling using try and catch block.
        try {
            meth1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


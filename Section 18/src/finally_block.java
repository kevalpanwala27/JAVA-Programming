public class finally_block {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }finally { // It will execute mandatory...
            System.out.println("Final Message");
        }
    }
}

// We can write try and finally block also without having catch block...
// and without finally block - last statement will execute...

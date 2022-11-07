
public class finally_block_2 {
    static void meth1()throws Exception {
        try {
            throw new Exception();
        }
        finally {
            //this message will definitely execute
            System.out.println("Final Message");
        }
    }
    public static void main(String[] args) {
        try {
            meth1();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

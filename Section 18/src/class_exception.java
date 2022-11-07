// Class exception means we can create our own exceptions.
class LowBalanceException extends Exception {
    public String toString() {
        return "Balance should not less than 5000";
    }
}
public class class_exception {
    public static void main(String[] args) {
        try {
            throw new LowBalanceException();
        }catch (LowBalanceException e) {
            System.out.println(e);
        }
    }
}





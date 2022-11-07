// Final means whose value is fixed, cannot be changed.
// Final variables cannot be modified.
class My {
    final int MIN = 1; // Declaration + initialization.
    static final int NORMAL;
    final int MAX;
    static { // By making static, by this also we can do initialization.
        NORMAL = 5;
    }
     public My() { // Constructor, by this also we can do initialization.
        MAX = 10;
    }
}
public class final_members {
    public static void main(String[] args) {

    }
}


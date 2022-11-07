class test {
    static {
        System.out.println("Block 1");
    }
    static {
        System.out.println("Block 2");
    }
}

public class static_blocks {
/*
        static {
            System.out.println("Block 1");
    }
*/

    public static void main(String[] args) {
        System.out.println("Hello, Keval!");
        Test t = new Test();
    }
/*
    static {
        System.out.println("Block 2");
    }
*/
}




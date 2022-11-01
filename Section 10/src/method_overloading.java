// Method Overloading means writing more than one method having same name but difference is in parameters.

public class method_overloading {

    static int max(int x, int y) {
        return x>y?x:y;
    }

    static int max(int x, int y, int z) {
        if(x>y && x>z)
            return x;
        else if(y>z)
            return y;
        return z;
    }

    static float max(float x, float y) {
        return x>y?x:y;
    }


    public static void main(String[] args) {
        System.out.print("For int max method: "+ max(10,5));
        System.out.println();
        System.out.print("For float max method: " + max(10f,5f));
        System.out.println();
        System.out.print("For int max method: "+ max(10,5,15));
    }
}



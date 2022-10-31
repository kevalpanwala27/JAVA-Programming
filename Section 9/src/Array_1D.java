public class Array_1D {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = {1,2,3,4,5};
        int[] C;
        C = new int[10];

        B[2]=15;

        for (int i = 0; i<B.length; i++) { // printing of array using simple loop.
            System.out.println(B[i]);
        }
        // B.length is a method to know length of an array.
        System.out.println();

        for (int x:B) { //  printing array using foreach loop.
            System.out.println(x);
        }

        System.out.println(B); // This will only print the address of the array.
        System.out.println(B.length); // This will show the length of an array.
    }
}


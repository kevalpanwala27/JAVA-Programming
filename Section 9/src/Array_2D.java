public class Array_2D {
    public static void main(String[] args) {
        int A[][]=new int[3][4]; // Declaration of array.
        int B[][]={{1,2,3},{2,4,6},{1,3,5}}; // Declaration + initialization.
        int C[][];
        C=new int[5][5];

        // Using for-loop for printing of an array.
        for (int i=0; i<B.length; i++) {
            for (int j=0; j<B[0].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Using for-each loop for printing of an array.
        for (int x[]:B) {
            for (int y:x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }

        System.out.println(B); // By directly printing it will print address of an array.
    }
}




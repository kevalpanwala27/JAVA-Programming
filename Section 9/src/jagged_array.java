public class jagged_array {
    public static void main(String[] args) {
        int X[][];
        X=new int[3][];

        X[0]=new int[5];
        X[1]=new int[3];
        X[2]=new int[8];

        // Printing jagged array using for-each loop.
        for(int x[]:X)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }

    }
}




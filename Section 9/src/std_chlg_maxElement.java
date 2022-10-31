public class std_chlg_maxElement {
    public static void main(String[] args) {
        int[] A = {2,4,6,8,10,12,14};
        int max;
        max = A[0];
        for (int i =0; i< A.length; i++) {
            if (A[i]>max) {
                max = A[i];
            }
        }
        System.out.println("Max element is " +max);
    }
}



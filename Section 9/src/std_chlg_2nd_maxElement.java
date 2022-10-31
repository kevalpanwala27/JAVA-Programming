public class std_chlg_2nd_maxElement {
    public static void main(String[] args) {
        int[] A = {2,4,6,8,10,12,14};
        int max1, max2;

        max1=max2=A[0];

        for (int i = 0; i<A.length; i++) {
            if (A[i]>max1) {
                max2=max1;
                max1=A[i];
            } else if (A[i]>max2) {
                max2=A[i];
            }
        }
        System.out.println("Second largest is " + max2);
    }
}




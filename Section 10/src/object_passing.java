public class object_passing {
    // Writing a method to change element.
    static void change(int A[], int index, int value) {
        A[index]=value;
    }
    public static void main(String[] args) {
        int A[]={2,4,6,8,10};
        change(A,2,20);
        for (int x:A) { // Printing of an array.
            System.out.println(x);
        }
    }
}


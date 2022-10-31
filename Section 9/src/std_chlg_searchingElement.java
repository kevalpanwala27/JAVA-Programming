import java.util.Scanner;

public class std_chlg_searchingElement {
    public static void main(String[] args) {
        System.out.print("Enter your key: ");
        int[] A = {2, 4, 6, 8, 10, 12, 14};
        int key;
        Scanner sc = new Scanner(System.in);
        key = sc.nextInt();

        for (int i = 0; i < A.length; i++) {
            if (key == A[i]) {
                System.out.print("Element find at: " + i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}





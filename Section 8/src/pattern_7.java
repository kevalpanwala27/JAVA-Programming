// Nested for loops practice - pattern 7.
public class pattern_7 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i<=5; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println("");
        }
    }
}



// Nested for loops practice - pattern 11.
public class pattern_11 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println(" ");
        }
    }
}



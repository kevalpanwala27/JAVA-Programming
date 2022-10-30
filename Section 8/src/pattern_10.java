// Nested for loops practice - pattern 10.
public class pattern_10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
    }
}




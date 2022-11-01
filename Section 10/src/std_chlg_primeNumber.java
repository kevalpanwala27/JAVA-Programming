import java.util.Scanner;

public class std_chlg_primeNumber {

    static boolean isPrime(int n) {
        for (int i = 2; i<n/2; i++) {
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
}




// GCD = HCF
public class std_chlg_GDC_of2Numbers {

    int gcd(int m, int n) {
        while (m != n) {
            if (m > n)
                m = m - n;
            else
                n = n - m;
        }
        return m;
    }

    public static void main(String[] args) {
        std_chlg_GDC_of2Numbers X = new std_chlg_GDC_of2Numbers();
        System.out.println(X.gcd(25,15));
    }
}


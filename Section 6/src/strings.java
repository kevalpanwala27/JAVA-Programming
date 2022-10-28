// Creating string objects.
public class strings {
    public static void main(String[] args) {
        String str1 = "Java Programming"; // this will only point to pool.
        String str2 = new String("Java"); // new = constructor // when we say new this string will point towards heap.
        // New means you have created a constructor.

        char[] c = {'h','e','l','l','o'};
        String str3 = new String(c);

        byte[] b = {65, 66, 67, 68};
        String str4 = new String(b);
        byte[] x = {65, 66, 67, 68};
        String str5 = new String(x, 1,2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}

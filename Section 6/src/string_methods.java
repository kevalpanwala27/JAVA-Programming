// String Methods 1 practice.
public class string_methods {
    public static void main(String[] args) {
        String str = new String("netbeans"); // constructor is used.
        String a = new String("      KEVAL     ");

        int len = str.length();
        String str1 = str.toUpperCase();
        String str2 = a.trim();
        String str3 = str.substring(3);
        String str4 = str.substring(3, 6);
        String str5 = str.replace('e', 'x');

        System.out.println(len);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}

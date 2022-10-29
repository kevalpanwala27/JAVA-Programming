// Conditionals statements practice.
import java.util.Scanner;

public class std_chlg_website {
    public static void main(String[] args) {
        System.out.print("enter your url: ");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));

        if (protocol.equals("http")) {
            System.out.println("Hypertext transfer protocol");
        } else if (protocol.equals("fts")) {
            System.out.println("File transfer protocol");
        }

        String ext = url.substring(url.lastIndexOf(".") + 1);

        if (ext.equals("com")) {
            System.out.println("Commercial");
        } else if (ext.equals("org")) {
            System.out.println("Organization");
        } else if (ext.equals("net")) {
            System.out.println("Network");
        }
    }
}


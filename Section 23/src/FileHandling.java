import java.io.File;

public class FileHandling {
    public static void main(String[] args) throws Exception {
        File f = new File("/Users/kevalpanwala/Desktop/Text File");
        System.out.println(f.isDirectory());
        String list[] = f.list();
        File List[]=f.listFiles();
        for (File y:List) {
            System.out.print(y.getName());
            System.out.println(y.getPath());
        }
        System.out.println();
        for (String x:list) {
            System.out.println(x);
        }
    }
}

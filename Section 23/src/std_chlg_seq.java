import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class std_chlg_seq {
    public static void main(String[] args) throws Exception {
        java.io.FileInputStream fis1 = new java.io.FileInputStream("/Users/kevalpanwala/Desktop/Text File/Source1.txt");
        java.io.FileInputStream fis2 = new java.io.FileInputStream(("/Users/kevalpanwala/Desktop/Text File/Source2.txt"));

        FileOutputStream fos = new FileOutputStream("/Users/kevalpanwala/Desktop/Text File/Destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        int b;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }
        fis1.close();
        fis2.close();
        fos.close();
        sis.close();
    }
}
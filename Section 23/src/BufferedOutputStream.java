import java.io.BufferedInputStream;

public class BufferedOutputStream {
    public static void main(String[] args) throws Exception {
        java.io.FileInputStream fis = new java.io.FileInputStream("/Users/kevalpanwala/Desktop/Text File/Buffer.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        // Using buffer input stream we can repeat the part which is already printed.
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());





        // Printing of buffer input stream.
        int x;
        while ((x= bis.read())!=-1) {
            System.out.print((char) x);
        }
        System.out.println();




        // Benefit of using Buffer Input Stream
        System.out.println("File: " + fis.markSupported());
        System.out.println("Buffer: " + bis.markSupported());




        bis.close();
        fis.close();
    }
}

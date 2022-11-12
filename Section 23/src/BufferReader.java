import java.io.BufferedReader;
public class BufferReader {
    public static void main(String[] args) throws Exception {
        java.io.FileReader fis= new java.io.FileReader("/Users/kevalpanwala/Desktop/Text File/Buffer.txt");
        BufferedReader bis = new BufferedReader(fis);

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
        System.out.println();
        System.out.println("String: " + bis.readLine());



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

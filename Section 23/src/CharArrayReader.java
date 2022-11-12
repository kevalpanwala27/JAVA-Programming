public class CharArrayReader {
    public static void main(String[] args) throws Exception {
        char c[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        java.io.CharArrayReader cr = new java.io.CharArrayReader(c);

        int x;
        while ((x=cr.read())!=-1)
        {
            System.out.print((char) x);
        }
        cr.close();
    }
}

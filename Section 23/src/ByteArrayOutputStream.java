public class ByteArrayOutputStream {
    public static void main(String[] args) throws Exception {
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        byte b[]= bos.toByteArray();

        for (byte x:b) {
            System.out.println((char) x);
        }
        bos.close();
    }
}

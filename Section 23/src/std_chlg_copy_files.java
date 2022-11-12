public class std_chlg_copy_files {
    public static void main(String[] args) throws Exception {
        java.io.FileInputStream fis = new java.io.FileInputStream("/Users/kevalpanwala/Desktop/Text File/Source1.txt");
        java.io.FileOutputStream fos = new java.io.FileOutputStream("/Users/kevalpanwala/Desktop/Text File/Source2.txt");

        int b;
        while((b=fis.read())!=-1)
        {
            if (b>=65 && b<=90)
                fos.write(b+32);
            else
                fos.write(b);
        }
        fis.close();
        fos.close();
    }
}

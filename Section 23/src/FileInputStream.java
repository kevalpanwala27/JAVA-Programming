public class FileInputStream {
    public static void main(String[] args) throws Exception {
            try (java.io.FileInputStream fis = new java.io.FileInputStream("/Users/kevalpanwala/Desktop/Text File/Input.txt"))
            {
                byte b[] = new byte[fis.available()];
                fis.read(b);

                String str = new String(b);

//                System.out.println(str);

                int x;
                do {
                    x= fis.read();
                    if (x!=-1)
                        System.out.print((char) x);
                }while (x!=-1);

                while ((x= fis.read())!=-1) {
                    System.out.print((char) x);
            }
            }
        }
    }



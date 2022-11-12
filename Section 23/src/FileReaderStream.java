import java.io.FileReader;

public class FileReaderStream {
    public static void main(String[] args) throws Exception {
            try(FileReader fr = new FileReader("/Users/kevalpanwala/Desktop/Text File/Reader.txt"))
            {
                int x;
                do {
                    x=fr.read();
                    if (x!=-1)
                        System.out.print((char) x);
                }while (x!=-1);

                while ((x= fr.read()) != -1)
                    System.out.println((char) x);
        }
    }
}

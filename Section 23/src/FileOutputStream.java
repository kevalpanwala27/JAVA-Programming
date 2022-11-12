import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputStream {
    public static void main(String[] args) {
        try {
            java.io.FileOutputStream fos = new java.io.FileOutputStream("/Users/kevalpanwala/Desktop/Text File/Keval.txt");
                                                        // Path if given here.
            String str = "Learn Java Programming";
//            fos. ---> fos. will show methods that sre used by FileOutputStream.



            byte b[]=str.getBytes();
            for (byte x:b) { // Here we are using foreach loop for printing the txt file.
                fos.write(x);
            }


            fos.write(b,6,str.length()-6); // using offset.


            fos.write(str.getBytes());// Direct method to write the string in txt file.
            fos.close();


        } catch (FileNotFoundException e) { // this catch block is for fos. method.
            throw new RuntimeException(e);
        } catch (IOException e) { // This is for FileOutputStream object.
            throw new RuntimeException(e);
        }
    }
}

/*
*** Byte Stream ***
 Input Stream.
 Output Stream.
*/
/*
*** Character Stream ***
 Writer.
 Reader.
*/

// To write data in file we use output streams.
// To read data in file we use input streams.

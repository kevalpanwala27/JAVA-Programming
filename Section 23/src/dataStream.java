import java.io.DataOutputStream;
import java.io.FileOutputStream;
class Student1
{
    int rollNo;
    String name;
    float avg;
    String dept;
}
public class dataStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/kevalpanwala/Desktop/Text File/Student2.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        Student1 s1 = new Student1();
        s1.rollNo = 41;
        s1.name = "Keval Panwala";
        s1.dept = "CSE";
        s1.avg = 90f;

        dos.writeInt(s1.rollNo);
        dos.writeUTF(s1.name);
        dos.writeUTF(s1.dept);
        dos.writeFloat(s1.avg);

        dos.close();
        fos.close();
    }
}

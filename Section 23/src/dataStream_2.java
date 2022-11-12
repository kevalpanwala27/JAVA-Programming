import java.io.DataInputStream;
import java.io.FileInputStream;

class student_11
{
    int rollNo;
    String name;
    float avg;
    String dept;
}
public class dataStream_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/kevalpanwala/Desktop/Text File/Student2.txt");
        DataInputStream dis = new DataInputStream(fis);

        student_11 st1 = new student_11();
        st1.rollNo = dis.readInt();
        st1.name = dis.readUTF();
        st1.dept = dis.readUTF();
        st1.avg = dis.readFloat();

        System.out.println("Roll No: " + st1.rollNo);
        System.out.println("Name: " + st1.name);
        System.out.println("Dept: " + st1.dept);
        System.out.println("Avg: " + st1.avg);

        dis.close();
        fis.close();
    }
}

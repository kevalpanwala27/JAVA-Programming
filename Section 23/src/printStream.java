// ************ IMPORTANT ************ //


// This is for Writing ....
import java.io.FileOutputStream;
import java.io.PrintStream;
class Student
{
    int rollNo;
    String name;
    String dept;
}
public class printStream {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/kevalpanwala/Desktop/Text File/Student1.txt");
        PrintStream ps = new PrintStream(fos);

        Student s = new Student();
        s.rollNo = 41;
        s.name = "Keval Panwala";
        s.dept = "CSE";

        ps.println(s.rollNo);
        ps.println(s.name);
        ps.println(s.dept);

        ps.close();
        fos.close();
    }
}

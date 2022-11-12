import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class student
{
    int rollNo;
    String name;
    String dept;
}
public class printStream_2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/kevalpanwala/Desktop/Text File/Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        student st = new student();
        st.rollNo = Integer.parseInt(br.readLine());
        st.name = br.readLine();
        st.dept = br.readLine();

        System.out.println("Roll number: " + st.rollNo);
        System.out.println("Name: " + st.name);
        System.out.println("dept: " + st.dept);
    }
}

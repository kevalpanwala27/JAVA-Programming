import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Stud implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t;

    public Stud()
    {

    }
    public Stud(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }

    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }

}

public class serialization {
    /*
        public static void main(String[] args) throws Exception {
            FileOutputStream fos=new FileOutputStream("/Users/kevalpanwala/Desktop/Text File/Student3.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            Stud s=new Stud(10,"John",89.9f,"CSE");

            oos.writeObject(s);

            fos.close();
            oos.close();
        }
    */
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("/Users/kevalpanwala/Desktop/Text File/Student3.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Stud s = (Stud) ois.readObject();

        System.out.println(s);

        fis.close();
        ois.close();
    }
}
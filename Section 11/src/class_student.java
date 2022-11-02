import java.util.Scanner;

class Student {
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total() {
        return m1 + m2 + m3;
    }

    public float average() {
        return (float) total() / 3;
    }

    public char grade() {
        if (average() >= 60) {
            return 'A';
        } else {
            return 'B';
        }
    }
    public String details() {
        return "Roll number: " + roll + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n";
    }
    public String toString() {
        return "\n" + "Roll number: " + roll + "\n" + "Name: " + name + "\n" + "Course: " + course + "\n";
    }
}
public class class_student {
    public static void main(String[] args) {
        Student s = new Student(); // s = reference of an object of class.
        s.roll = 41;
        s.name = "Keval Panwala";
        s.course = "CSE";
        s.m1 = 70;
        s.m2 = 80;
        s.m3 = 65;
        System.out.println("Total marks is: " + s.total());
        System.out.println("Average is: " + s.average());
        System.out.println("Grade is: " + s.grade());
        System.out.println();
        System.out.println("Details is: " + s.details());
        System.out.println("Details is: " + s); // Give reference of an object, and it will print toString method.
    }
}



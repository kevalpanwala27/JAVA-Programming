class Subject {
    private String subID; // Properties
    private String name; // Properties
    private int maxMarks; // Properties
    private int marksObtains; // Properties

    public Subject(String subID,String name,int maxMarks) { // constructor
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public String getSubID(){ // Get method.
        return subID;
    }
    public String getName(){ // Get method.
        return name;
    }
    public int getMaxMarks(){ // Get method.
        return maxMarks;
    }
    public int getMarksObtains(){ // Get method.
        return marksObtains;
    }

    public void setMaxMarks(int mm) { // Set method.
        maxMarks=mm;
    }
    public void setMarksObtain(int m) { // Set method.
        marksObtains=m;
    }
    boolean isQualified() {
        return marksObtains>=maxMarks/10*4;
    }

    public String toString() { // Simple method
        return"\n SubjectID: "+subID+"\n Name: "+name+"\n MarksObtained: "+marksObtains;
    }
}
public class array_of_objects {
    public static void main(String[] args) {
        Subject subs[]=new Subject[3]; // Array of objects.
        subs[0]=new Subject("s101","DS",100);
        subs[1]=new Subject("s102","Algorithms",100);
        subs[2]=new Subject("s103","Operating Systems",100);

        for(Subject s:subs) // Printing of array...
            System.out.println(s);
    }
}





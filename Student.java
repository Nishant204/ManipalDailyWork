import java.security.PublicKey;

public class Student {
    
    String name;
    int rollNo;
    String college;
    String place;
    String branch;

    public void addStudent(String name, int rollNo, String college, String place, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.college = college;
        this.place = place;
        this.branch = branch;
    }
    public int getRollNo() {
        return rollNo;
    }
   
}

package studentmarks;


public class Student {

    
    int studnetID;
    String studentName;
    
    public Student() {
        
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudnetID(int studnetID) {
        this.studnetID = studnetID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudnetID() {
        return studnetID;
    }  
}

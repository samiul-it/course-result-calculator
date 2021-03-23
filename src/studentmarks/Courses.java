
package studentmarks;


public class Courses extends Student{

    String course1;
    String course2;
    String course3;
    String course4;
    
    public Courses() {
        
        setStudentName(studentName);
        setStudnetID(studnetID);
    }
    
    public void setCourse1(String course1) {
        this.course1 = course1;
    }

    public void setCourse2(String course2) {
        this.course2 = course2;
    }

    public void setCourse3(String course3) {
        this.course3 = course3;
    }

    public void setCourse4(String course4) {
        this.course4 = course4;
    }

    public String getCourse1() {
        return course1;
    }

    public String getCourse2() {
        return course2;
    }

    public String getCourse3() {
        return course3;
    }

    public String getCourse4() {
        return course4;
    }
    
}

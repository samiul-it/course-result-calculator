package studentmarks;

public final class StudentMarks extends Courses{

    int course1No;
    int course2No;
    int course3No;
    int course4No;
    private ResultType resultType;
    private ResultType result;

    
    
    
    
    public void setCourse1No(int course1No) {
        this.course1No = course1No;
    }

    public void setCourse2No(int course2No) {
        this.course2No = course2No;
    }

    public void setCourse3No(int course3No) {
        this.course3No = course3No;
    }

    public void setCourse4No(int course4No) {
        this.course4No = course4No;
    }

    public int getCourse1No() {
        return course1No;
    }

    public int getCourse2No() {
        return course2No;
    }

    public int getCourse3No() {
        return course3No;
    }

    public int getCourse4No() {
        return course4No;
    }
    
    protected int getAvgNo(){
        
        return (course1No+course2No+course3No+course4No)/4;
    }
    
    protected void getAllNo(){
        System.out.println("Course 1-"+course1+" No.:"+course1No);
        System.out.println("Course 2-"+course2+" No.:"+course2No);
        System.out.println("Course 3-"+course3+" No.:"+course3No);
        System.out.println("Course 4-"+course4+" No.:"+course4No);
    }

    public void setResultType(ResultType resultType) {
        this.resultType = resultType;
    }

    public ResultType getResultType(ResultType result) {
        return resultType=result;
    }
    
    protected ResultType finalResult(){
        
        if(course1No>=40 && 40<=course2No){
            System.out.println(course1No );
            result=ResultType.Pass;
            return getResultType(result);
        }
        else if(course1No<=39){
            result=ResultType.Fail;
            return getResultType(result);
         
        }
        else if(getAvgNo()>=40){
            result=ResultType.Pass;
            return getResultType(result);
        }

        return ResultType.Incomplete;
    } 
    
}

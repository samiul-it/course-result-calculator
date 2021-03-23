package studentmarks;

public class ResultCalculator {
    public static void main(String[] args) {
        

        StudentMarks sm=new StudentMarks();
        sm.setStudentName("Samiul");
        sm.setStudnetID(101);
        sm.setCourse1("Data Structure");
        sm.setCourse1No(44);
        sm.setCourse2("Java Programming");
        sm.setCourse2No(38);
        sm.setCourse3("Math");
        sm.setCourse3No(88);
        sm.getAllNo();
        int avgNo=sm.getAvgNo();
        ResultType finalResult=sm.finalResult();
        System.out.println("Student Name:"+sm.getStudentName()
                + " Result Type:"+finalResult+" Average No:"+avgNo);

    }
    
}

public class Student{
    private int studentId;
    private String studentName;
    private Integer[] studentMarks;
    private float average;
    private char grade;

    public Student(int studentId, String studentName, Integer[] studentMarks){
        this.studentId=studentId;
        this.studentName=studentName;
        this.studentMarks=studentMarks;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public int getStudentId(){
        return studentId;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public String getStudentName(){
        return studentName;
    }
    public Integer[] setStudentMarks(Integer[] studentMarks){
        return this.studentMarks = getStudentMarks();
    }
    public Integer[] getStudentMarks(){
        return studentMarks;
    }
    public void setAverage(float average){
        this.average=average;
    }
    public float getAverage(){
        return average;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public char getGrade(){
        return grade;
    }

    public void calculateAvg(){
        StudentMain sm = new StudentMain ();
        int sum=0;
        for(int i=0;i<studentMarks.length;i++){
            sum+=studentMarks[i];
        }
        float avg=sum/sm.n;
        setAverage(avg);
    }
    public void findGrade(){
       float avg=getAverage();
       if (avg>=90 && avg<=100){
           setGrade('O');
       } 
       else if (avg>=80 && avg<90){
           setGrade('A');
       } 
       else if (avg>=70 && avg<80){
           setGrade('B');
       } 
       else if (avg>=60 && avg<70){
           setGrade('C');
       }  
       else if (avg>=50 && avg<60){
            setGrade('D');
       }
       else if (avg>=40 && avg<50){
            setGrade('E');
       }
       else {
           setGrade('F');
       }
    }
}
import java.util.*;
import java.io.*;

public class StudentMain{
    static Scanner sc = new Scanner(System.in);
    static int n;
    static List<Integer> al = new ArrayList<Integer>();
    public static Student getStudentDetails(){
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        System.out.println("Enter name:");
        String name=sc.next();
        System.out.println("Enter the no of subjects");
        n = sc.nextInt();
        if (n<=0){
            System.out.println("Invalid number of subjects");
            System.out.println("Enter the number of subjects");
            n=sc.nextInt();
        }


        //List<Integer> al = new ArrayList<Integer>();
        for (int i=0; i<n;i++){
            int t=i+1;
            System.out.println("Enter mark for subject" +t);
            int m =sc.nextInt();
            //List<Integer> al = new ArrayList<Integer>();
            //System.out.println(m);
            al.add(m);

        }

        Integer[] marks = new Integer[al.size()];
        for (int i =0; i<al.size(); i++){
            marks[i] = al.get(i);
        }
        for (Integer x : marks){
            //return marks;
        }

        //int [] marks = null;
        Student s = new Student(id,name,marks);
        return s;

    }
    public static void main (String[] args) {
        Student s2 = getStudentDetails();
        System.out.println("Id:" + s2.getId());
        System.out.println("Name:" + s2.getName());
        s2.calculateAvg();
        System.out.println("Average:"+s2.getAverage());
        s2.findGrade();
        System.out.println("Grade:"+s2.getGrade());
    }
}
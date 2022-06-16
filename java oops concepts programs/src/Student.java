public class Student {
    int studentId;
    String studentName;
    Student(int studentId,String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    Student(){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public static void main(String args[]){
        Student s=new Student(101,"abc");
        System.out.println(s.studentId+","+s.studentName);
        Student s1=new Student();
        System.out.println();

    }
}

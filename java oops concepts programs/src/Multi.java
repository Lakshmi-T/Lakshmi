class Teacher{
    void dispay(){
        System.out.println("dispaly Teacher");
    }
}
class Student1 extends Teacher{
    void fun(){
        System.out.println("fun");
    }
}
class Student2 extends Teacher{
    void special(){
        System.out.println("special");
    }
}
public class Multi {
    public static void main(String[] args) {
        Student2 stud=new Student2();
        stud.dispay();
        stud.special();
        Student1 stud1=new Student1();
        stud1.fun();
    }
}

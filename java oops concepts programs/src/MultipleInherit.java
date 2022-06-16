interface School {
    void display();
}
interface Emp{
    void fun();
}
class Movie implements School,Emp  {
    public void display(){
        System.out.println("Teacher is display");
    }
    public void fun()
    {
        System.out.println("Student is fun");
    }
    public class MultipleInherit
    {
        public  void main(String[] args) {
            Movie m=new Movie();
            m.display();
            m.fun();
        }
    }
}











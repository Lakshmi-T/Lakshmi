interface School1 {
    void display();
}
interface Emp1{
    void fun();
}
class Movie1 implements School1,Emp1 {
    @Override
    public void display() {
        System.out.println("School is display");
    }

    @Override
    public void fun() {
        System.out.println("emp is display");
    }

    public class MultipleInherit1 {
        public void main(String[] args) {
            Movie m = new Movie();
            m.display();
            m.fun();
        }
    }
}






















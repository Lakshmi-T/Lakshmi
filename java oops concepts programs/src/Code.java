class student{
    void run(){
        System.out.println("A is run");
    }
}
class B extends student{
    void display(){
        System.out.println("B is display");
    }
}
public class Code {
    public static void main(String[] args) {
        B b=new B();
        b.display();
        b.run();
    }
}

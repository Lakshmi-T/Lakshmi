interface Pad{
    void eat();
}
public class PracInterf1 implements Pad {
    @Override
    public void eat() {
        System.out.println("hai");
    }
    public static void main(String args[]){
        PracInterf1 obj=new PracInterf1();
        obj.eat();
    }
}

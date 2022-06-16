interface Animal{
    void eat();
}
class Dog implements Animal{
    public void eat(){
        System.out.println("new idea hiekk");
    }
}
class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("hello i am cat");
    }
}

public class PracInterf2 {
    public static void main(String args[]){
        Cat c=new Cat();
        c.eat();


    }
}

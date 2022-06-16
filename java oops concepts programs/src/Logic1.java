public class Logic1 {
    int num;
    String Name;
    //function without parameter
    void display(){
        System.out.println("all are display");
    }
    void run(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
      Logic1 l1=new Logic1();
        l1.display();
        l1.run(10);
    }
}

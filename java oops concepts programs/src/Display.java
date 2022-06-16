public class Display {

    public void Display(){
        System.out.println("Display without parameter constructor");
    }
    public void Display(int x){
        System.out.println("Display single parameter constructor");
    }
    public void Display(int x,int y){
        System.out.println("Display double parameter constructor");
    }

    public static void main(String[] args) {
       Display d = new Display();
       d.Display();
       d.Display(10);
       d.Display(10,20);


    }
    }

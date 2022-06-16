abstract class  Language{
    abstract void display();
        }
        class Teach extends Language {
            void display() {
                System.out.println("Absract language is display");
            }
        }

            public class Abstra  {
                public static void main(String[] args) {
                    Language obj=new Teach();
                    obj.display();


      }
}
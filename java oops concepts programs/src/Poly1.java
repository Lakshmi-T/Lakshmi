public class Poly1 {
    static String display(String a, String b) {
        String c = a + b;
        return c;
    }

    static String display(String a, String b, String c) {
        String d = a + b + c;
        return d;
    }


    public static void main(String[] args) {
    System.out.println(Poly1.display("deepthi","lakshmi"));
    System.out.println(Poly1.display("keerthi","Lakshmi","Kavitha"));
    }
}
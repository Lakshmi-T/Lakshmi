public class Poly {
    static int sub(int a,int b){
      int c=a+b;
      return c;
    }
    static int sub(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
    public static void main(String[] args) {
        System.out.println(Poly.sub(10,20));
        System.out.println(Poly.sub(10,15,20));
    }
}
public class Armstrong {
    public static void main(String[] args) {
        // write your code here
        int no=153; int temp=no; int r=0; int cube=0; int sum=0;
        for(int i=1;i<=3;i++){
            r=no%10;
            cube=r*r*r;
            sum=sum+cube;
            no=no/10;
        }
        if(sum==temp) {
            System.out.println("armstrong");
        } else {
            System.out.println("Not a Armstrong");
        }
    }

}

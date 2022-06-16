package Exceptions;
import java.io.*;


public class excep3 {
    public static void main(String[] args) {
        char[] arr=new char[50];
        try{
            FileInputStream obj=new FileInputStream("D:\\java.txt");
            InputStreamReader obj1=new InputStreamReader(obj) ;
            obj1.read(arr);
            System.out.println(arr);
            obj1.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
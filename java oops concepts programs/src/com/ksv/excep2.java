package com.ksv;
import java.io.*;
public class excep2 {
    public static void main(String[] args)
    {
        char [] arr=new char[30];
        try{
            FileOutputStream obj=new FileOutputStream("D:\\java3");
            String s="Rose is butiful";
            byte B[]=s.getBytes();
            obj.write(B);
            obj.write(66);
            obj.close();
            System.out.println("Byee");
            FileInputStream obj1=new FileInputStream("D:\\java3");
            InputStreamReader obj2=new InputStreamReader(obj1);
            obj2.read(arr);
            System.out.println(arr);
            obj2.close();
        }
        catch (Exception e){
            System.out.println(e);
            e.getStackTrace();
        }
    }
}




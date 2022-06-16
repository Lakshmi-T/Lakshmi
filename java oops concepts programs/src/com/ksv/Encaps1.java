package com.ksv;
import java.io.*;
public class Encaps1 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("D:\\blank");
            String s="Welcome to my page";
            byte b[]=s.getBytes();
            fout.write(b);
            fout.write(66);
            fout.close();
            System.out.println("Hello");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
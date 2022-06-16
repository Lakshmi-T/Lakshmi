package com.ksv;

public class Prac12 {
    public static void main(String[] args) {
        try {
         int divide=20/0;
         System.out.println("hai");
        }
        catch (ArithmeticException e){
            System.out.println("error i occured");
        }
        finally {
            System.out.println("finally we blocked");
        }
    }
}
package com.jetbrains;
class Calculator{
    static int add(int a,int b){
        return a+b;
    }
    static int subtract(int a,int b){
        return a-b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
    static int divide(int a,int b){
        return a/b;
    }
}
public class firstques {
    public static void main(String[] args) {
        System.out.println(("SSS"));
        Calculator cal = new Calculator();
                int addition,subtraction,multiplication,division;
                addition = cal.add(2,3);
                subtraction = cal.subtract(8,9);
                multiplication = cal.multiply(8,9);
                division = cal.divide(8,4);
                System.out.println((addition));
                System.out.println((subtraction));
                System.out.println((multiplication));
                System.out.println((division));
    }
}

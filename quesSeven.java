package com.jetbrains;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class Triangle{
    static double area(int a,int b,int c){
        if ((a+b>=c) || (b+c>=a) || (c+a>=b)){
            double area;
            double p = (a+b+c)/2;
            area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return area;
        }
        else{
            return 0;
        }
    }
}
public class Main{
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double result = triangle.area(a,b,c);
        System.out.println("Area:" + result);

    }
}

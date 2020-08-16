package com.jetbrains;
import java.util.*;
class Circle{
    private double radius = 1.0;
    private String color = "red";
    double area;
    Circle(){

    }
    Circle(double tempradius){
        radius = tempradius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return (Math.PI*radius*radius);
    }
}
public class Main{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(5.0);
        System.out.println("Default Radius:" + circle.getRadius());
        System.out.println(("Default Area:"+ circle.getArea()));
        System.out.println("User Given Radius:" + circle1.getRadius());
        System.out.println("User Given Area:" + circle1.getArea());
    }
}

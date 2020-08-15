package com.jetbrains;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class Rectangle{
    static void display(int height,int width){
        System.out.println("Height: "+height+" "+"Width: "+width);
    }
}

class RectangleArea {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String[] HandW = input.split(" ");
    int height = Integer.parseInt(HandW[0]);
    int width = Integer.parseInt(HandW[1]);
    static void display(int height,int width){
        System.out.println("The Area of rectangle:" + height*width);
    }
}
public class Main{
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        RectangleArea recArea = new RectangleArea();
        rec.display(recArea.height, recArea.width);
        recArea.display(recArea.height, recArea.width);

    }
}

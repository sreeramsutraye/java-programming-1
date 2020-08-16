package com.jetbrains;// Java program to Add two complex numbers

import java.util.*;
import com.jetbrains.*;

// User Defined Complex class
class Complex {

    // Declaring variables
    int real, imaginary;

    // Empty Constructor
    Complex()
    {
    }

    // Constructor to accept
    // real and imaginary part
    Complex(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }

    // Defining addComp() method
    // for adding two complex number
    Complex addComp(Complex C1, Complex C2)
    {
        // creating temporary variable
        Complex temp = new Complex();

        // adding real part of complex numbers
        temp.real = C1.real + C2.real;

        // adding Imaginary part of complex numbers
        temp.imaginary = C1.imaginary + C2.imaginary;

        // returning the sum
        return temp;
    }
    Complex subtractComp(Complex C1, Complex C2)
    {
        // creating temporary variable
        Complex temp = new Complex();

        // adding real part of complex numbers
        temp.real = C1.real - C2.real;

        // adding Imaginary part of complex numbers
        temp.imaginary = C1.imaginary - C2.imaginary;

        // returning the sum
        return temp;
    }
    Complex multiplyComp(Complex C1, Complex C2)
    {
        // creating temporary variable
        Complex temp = new Complex();

        // adding real part of complex numbers
        temp.real = (C1.real*C2.real)-(C1.imaginary*C2.imaginary);

        // adding Imaginary part of complex numbers
        temp.imaginary = (C1.real*C2.imaginary) + (C1.imaginary*C2.real);

        // returning the sum
        return temp;
    }
}

// Main Class
public class Main{

    // Main function
    public static void main(String[] args)
    {

        // First Complex number
        Complex C1 = new Complex(3, 2);

        // printing first complex number
        System.out.println("Complex number 1 : "
                + C1.real + " + i"
                + C1.imaginary);

        // Second Complex number
        Complex C2 = new Complex(9, 5);

        // printing second complex number
        System.out.println("Complex number 2 : "
                + C2.real + " + i"
                + C2.imaginary);

        // for Storing the sum
        Complex C3 = new Complex();
        Complex C4 = new Complex();
        Complex C5 = new Complex();

        // calling addComp() method
        C3 = C3.addComp(C1, C2);
        C5 = C5.subtractComp(C1, C2);
        C4 = C4.multiplyComp(C1, C2);


        // printing the sum
        System.out.println("Sum of complex number : "+ C3.real + " + i" + C3.imaginary);
        System.out.println("Subtraction of complex number : "+ C4.real + " + i" + C4.imaginary);
        System.out.println("Multiplication of complex number : " + C5.real + " + i" + C5.imaginary);
    }
}

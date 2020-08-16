package com.jetbrains;
import java.util.*;

class Employee{
    String EmpName;
    int EmpYearOfJoining;
    int EmpSalary;
    String EmpAddress;
    Employee(){
    }
    Employee(String name,int yearOfJoining, int salary,String address){
        EmpName = name;
        EmpYearOfJoining = yearOfJoining;
        EmpSalary = salary;
        EmpAddress = address;
    }
}
public class Main{
    public static void main(String[] args) {
        Employee Emp = new Employee("ABC",2019,50000,"ABC Street");
        Employee Emp1 = new Employee("DEF",2018,45000,"DEF Street");
        Employee Emp2 = new Employee("GHI",2020,70000,"GHI Street");
        System.out.println("Name    " + "Year of joining    "+ "  Address");
        System.out.println(Emp.EmpName +"          " + Emp.EmpYearOfJoining+"           "+ Emp.EmpAddress);
        System.out.println(Emp1.EmpName +"          " + Emp1.EmpYearOfJoining+"           "+ Emp1.EmpAddress);
        System.out.println(Emp2.EmpName +"          " + Emp2.EmpYearOfJoining+"           "+ Emp1.EmpAddress);

    }

}

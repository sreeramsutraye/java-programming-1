package com.jetbrains;
import java.util.LinkedList;
import java.util.Scanner;
class Main  {
    static  class Employee{
        int empId, empSalary;
        String empName, empDesignation, empLocation;
        public int getEmpId() {
            return empId;
        }
        public void setEmpId(int empId) {
            this.empId = empId;
        }
        public int getEmpSalary() {
            return empSalary;
        }
        public void setEmpSalary(int empSalary) {
            this.empSalary = empSalary;
        }
        public String getEmpName() {
            return empName;
        }
        public void setEmpName(String empName) {
            this.empName = empName;
        }
        public String getEmpDesignation() {
            return empDesignation;
        }
        public void setEmpDesignation(String empDesignation) {
            this.empDesignation = empDesignation;
        }
        public String getEmpLocation() {
            return empLocation;
        }
        public void setEmpLocation(String empLocation) {
            this.empLocation = empLocation;
        }
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        LinkedList<Employee> list = new LinkedList<>();
        for(int i = 0 ; i < 10 ; i++){
            Employee newEmp = new Employee();
            System.out.println("Enter Employee ID");
            newEmp.setEmpId(scan.nextInt());
            System.out.println("Enter Employee Name");
            newEmp.setEmpName(scan.nextLine());
            System.out.println("Enter Employee Designation");
            newEmp.setEmpDesignation(scan.nextLine());
            System.out.println("Enter Employee Location");
            newEmp.setEmpLocation(scan.nextLine());
            System.out.println("Enter Employee Salary");
            newEmp.setEmpSalary(scan.nextInt());
        }
        scan.close();
        System.out.println("All names of employees");
        list.forEach(e->{
            System.out.println(e.getEmpName());
        });
        list.stream().filter(e->e.getEmpSalary()>50000).forEach(e->{
            System.out.println(("Name : %s , Salary : %i"+e.getEmpName()+e.getEmpSalary()));
        });
        list.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e->{
            System.out.println(("Name : %s , Location : %s"+ e.getEmpName() +e.getEmpLocation()));
        });
        list.stream().filter(e->e.getEmpDesignation().endsWith("E")).forEach(e->{
            System.out.println(("Name : %s , Designation : %s"+e.getEmpName()+e.getEmpDesignation()));
        });
    }
}

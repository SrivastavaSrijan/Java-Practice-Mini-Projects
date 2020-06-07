package com.EmployeeManagement;

import java.util.*;

public class Main{
    private static ArrayList<Employee> myEmployees= new ArrayList<Employee>();
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        addEmp();
        System.out.println("\nEnter the Employee ID?");
        int EmpNo=sc.nextInt();
        getEmp(EmpNo);
    }
    private static void addEmp(){

        Employee newEmp1=new Employee(1001,"Ashish",'e',"01/04/2009","R&D",20000,8000,3000);
        myEmployees.add(newEmp1);
        Employee newEmp2=new Employee(1002,"Sushma",'c',"23/08/2012","PM",30000,12000,9000);
        myEmployees.add(newEmp2);
        Employee newEmp3=new Employee(1003,"Rahul",'k',"12/11/2008","Acct",10000,8000,1000);
        myEmployees.add(newEmp3);
        Employee newEmp4=new Employee(1004,"Chahat",'r',"29/01/2013","Front Desk",12000,2000,3000);
        myEmployees.add(newEmp4);
        Employee newEmp5=new Employee(1005,"Ranjan",'m',"16/07/2005","Engg",50000,20000,20000);
        myEmployees.add(newEmp5);
        Employee newEmp6=new Employee(1006,"Suman",'e',"1/01/2000","Manufacturing",23000,9000,4400);
        myEmployees.add(newEmp6);
        Employee newEmp7=new Employee(1007,"Tanmay",'c',"12/06/2006","PM",29000,12000,10000);
        myEmployees.add(newEmp7);
    }


    private static void getEmp(int EmpNo) {
        for (Employee emp : myEmployees) {
            if (emp.getEmpNo() == EmpNo) {
                emp.displayDetails(emp);
            }
        }

    }


}

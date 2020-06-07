  
package com.EmployeeManagement;

public class Employee {
    private int EmpNo;
    private String EmpName;
    private char DesCode;
    private String JoinDate;
    private String Dep;
    private int Basic;
    private int HRA;
    private int IT;
    private int Salary;
    private int DA;
    private String Designation;
    Employee(int empNo, String empName, char desCode, String joinDate, String dep, int basic, int HRA, int IT) {
        this.EmpNo = empNo;
        this.EmpName = empName;
        this.DesCode = desCode;
        this.JoinDate = joinDate;
        this.Dep = dep;
        this.Basic = basic;
        this.HRA = HRA;
        this.IT = IT;
        switch (this.DesCode){
            case 'e':
                this.Designation="Engineer";
                this.DA=20000;
                this.Salary=this.Basic+this.HRA+this.DA-this.IT;
            case 'c':
                this.Designation="Consultant";
                this.DA=32000;
                this.Salary=this.Basic+this.HRA+this.DA-this.IT;
            case 'k':
                this.Designation="Clerk";
                this.DA=12000;
                this.Salary=this.Basic+this.HRA+this.DA-this.IT;
            case 'r':
                this.Designation="Receptionist";
                this.DA=15000;
                this.Salary=this.Basic+this.HRA+this.DA-this.IT;
            case 'm':
                this.Designation="Manager";
                this.DA=40000;
                this.Salary=this.Basic+this.HRA+this.DA-this.IT;
        }
    }

    int getEmpNo() {
        return EmpNo;
    }

    String getEmpName() {
        return EmpName;
    }

    char getDesCode() {
        return DesCode;
    }

    String getJoinDate() {
        return JoinDate;
    }

    String getDep() {
        return Dep;
    }
    String getDesignation() {
        return Designation;
    }
    int getSalary() {
        return Salary;
    }

    void displayDetails(Employee emp){

        System.out.format("%-15s%-15s%-15s%-15s%-15s","Emp No.","Emp Name","Department","Designation","Salary");
        System.out.println();
        System.out.format("%-15s%-15s%-15s%-15s%-15s",emp.getEmpNo(),emp.getEmpName(),emp.getDep(),emp.getDesignation(),emp.getSalary());

    }

}

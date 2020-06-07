package com.EmployeeCollections;

public class ProjectManagers extends EmployeeWipro {
    private int experienceYears;
    ProjectManagers(String name, String address, int MobileNo,int exp){
       super(name,address,MobileNo);
       this.experienceYears=exp;
    }

}

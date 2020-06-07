package com.EmployeeCollections;

public class ProjectEngineers extends EmployeeWipro {
    private String collegeName;
    ProjectEngineers(String name, String address, int MobileNo,String collegeName){
        super(name,address,MobileNo);
        this.collegeName=collegeName;
    }


}

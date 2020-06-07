package com.EmployeeCollections;

public class ProjectLeads extends EmployeeWipro {
    private boolean isEligible;
    ProjectLeads(String name, String address, int MobileNo,boolean grat){
        super(name,address,MobileNo);
        this.isEligible=grat;
    }
}

package com.EmployeeCollections;
import java.util.*;

public abstract class EmployeeWipro {
    private String FirstName;
    private  String LastName;
    private  String Address;
    private  int MobileNumber;

    EmployeeWipro(String name, String address, int MobileNo){
        String[] temp=name.split(" ");
        this.FirstName=temp[0];
        if (temp.length>1)
            this.LastName=temp[1];
        else
            this.LastName="";
        this.Address=address;
        this.MobileNumber=MobileNo;

    }
    //Getters
    public  String getFirstName() {
        return FirstName;
    }
    public  String getLastName() {
        return LastName;
    }
    public  String getAddress() {
        return Address;
    }
    public  int getMobileNumber() {
        return MobileNumber;
    }




}

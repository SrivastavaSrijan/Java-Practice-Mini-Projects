package com.EmployeeCollections;
import java.util.*;
public class TeamWipro<T extends EmployeeWipro> {
    private String name;
    private List<T> listOfEmp=new ArrayList<>();
    TeamWipro(String name){
        this.name=name;
    }
    public  void addEmployees(T emp){
        if(listOfEmp.contains(emp)){
            System.out.println("The Employee is already on the pay roll.");
        }else{
            listOfEmp.add(emp);
        }
    }

    public List<T> getListOfEmp() {
        return new ArrayList<T>(listOfEmp);
    }

    public int getSize(){
        return listOfEmp.size();
    }
    public String getName() {
        return name;
    }


}

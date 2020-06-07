package com.StudentMarksDirectory.service;
import com.StudentMarksDirectory.bean.Student;
import com.StudentMarksDirectory.exception.CustomExceptions.*;
public class StudentReport {
    public String findGrade(Student student){
        int[] marks=student.getMarks();
        int sum=0;
        final String s;
        for(int i:marks){
            if(i<35){
                 s="F";
                 return s;
            }
            else sum += i;
        }
        if(sum<=150)  s="D";
        else if(sum>150&&sum<=200) s= "C";
        else if(sum>200&&sum<=250) s= "B";
        else s= "A";
        return s;
    }
    public String validate(Student studentObject) throws NullMarksArrayException,NullStudentException,NullNameException{
        if(studentObject==null) throw new NullStudentException();
        else{
            if(studentObject.getName()==null) throw new NullNameException();
            else if(studentObject.getMarks()==null) throw new NullMarksArrayException();
            else return findGrade(studentObject);
        }

    }

}


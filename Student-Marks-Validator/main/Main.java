package com.StudentMarksDirectory.main;
import com.StudentMarksDirectory.bean.Student;
import com.StudentMarksDirectory.exception.CustomExceptions.*;
import com.StudentMarksDirectory.service.*;

public class Main {
    private static Student[] data = new Student[4];
    static{
        for (int i = 0; i < data.length; i++) data [i]= new Student();
    data [0] = new Student("Nikki",new int[]{35,35,35});
    data [1] = new Student(null, new int[]{11,22,33});
    data [2] = null;
    data [3] = new Student("Manoj",null);
    }
    public static void main (String[] a) {
        StudentService studentService= new StudentService ();
        StudentReport studentReport= new StudentReport ();
        System.out.println (" Grades Calculation: ");
        String x = null;
        for (int i = 0; i < data.length; i++) {
            try {
                x = studentReport.validate (data[i]) ;
            }
            catch (NullNameException e) {
                x=e.toString();
            }
            catch (NullMarksArrayException e) {
                x=e.toString();
            }
            catch (NullStudentException e) {
                x=e.toString();
            }
            System.out.println ("Your Grade is: "+x);
        }
        System.out.println("Number of Objects with Marks array as null ="+studentService.findNumberOfNullMarks(data));
        System.out.println("Number ofObjects with Name as null="+ studentService.findNumberOfNullNames(data));
        System.out.println ("Number of Objects are entirely null="+studentService.findNumberOfNullObjects(data));
    }
}



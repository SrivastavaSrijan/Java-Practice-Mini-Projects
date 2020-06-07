package com.StudentMarksDirectory.service;
import com.StudentMarksDirectory.bean.Student;

public class StudentService {

   public int findNumberOfNullObjects(Student[] data){
        int n=0;
        for (Student s : data) {
            try{
                if(s==null){
                    throw new NullPointerException();
                }
            }
            catch (NullPointerException e){
                n++;
            }
        }
        return n;
    }

    public int findNumberOfNullMarks(Student[] data) {
        int n=0;
        for (Student s : data) {
            try{
                if(s.getMarks()==null){
                    throw new NullPointerException();
                }
            }
            catch (NullPointerException e){
                if(s!=null) n++;
            }


        }
        return n;
    }
    public int findNumberOfNullNames(Student[] data) {
            int n=0;
            for (Student s : data) {

                try {
                    if(s.getName()==null){
                        throw new NullPointerException();
                    }
                }
                catch (NullPointerException e) {
                    if(s!=null) n++;
                }
            }
            return n;

    }
}


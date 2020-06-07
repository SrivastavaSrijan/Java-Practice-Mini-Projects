package com.Practice;
import java.util.*;
import java.util.regex.*;
public class RemovePar {
    static void OpenPar(StringBuilder s){
        String regex1="\\(";
        Pattern p1=Pattern.compile(regex1);
        Matcher m1=p1.matcher(s);
        if(m1.find()){
            s.deleteCharAt(m1.start());
            OpenPar(s);
        }

        else{
            ClosedPar(s);
        }

    }
    static void ClosedPar(StringBuilder s){
        String regex1="\\)";
        Pattern p1=Pattern.compile(regex1);
        Matcher m1=p1.matcher(s);
        if(m1.find()){
            s.deleteCharAt(m1.start());
            ClosedPar(s);
        }
        else{
            return;
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder(str);
        OpenPar(s);

        System.out.print(s);





    }
}
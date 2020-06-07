/*package whatever //do not write package name here */
package com.Practice;
import java.io.*;
import java.util.*;
import java.util.regex.*;
class BalPar {
    static int balancedPar(String str){
        StringBuilder s=new StringBuilder(str);
        String regex1="\\(";
        Pattern p1=Pattern.compile(regex1);
        Matcher m1=p1.matcher(s);
        int count1=0,count2=0;
        while(m1.find()){
            count1++;
        }
        //System.out.print(count1);
        String regex2="\\)";
        Pattern p2=Pattern.compile(regex2);
        Matcher m2=p2.matcher(s);
        while(m2.find()){
            count2++;
        }
        //System.out.print(count2);
        if(count1==count2)
            return count1;
        else{
            return -1;
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int is=balancedPar(str);

        System.out.print(is);





    }
}
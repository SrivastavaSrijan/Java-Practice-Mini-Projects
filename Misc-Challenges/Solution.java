package com.Practice;

import java.io.*;
import java.util.*;
import java.util.regex.*;

import static java.util.stream.Collectors.joining;

public class Solution {

    // Complete the superReducedString function below.
    static void doMatch(StringBuilder sb){
        String regex="([a-zA-Z])\\1{1}";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(sb);
        String str=new String();
        if(m.find()){
            //str=str+m.group();
            //System.out.println(str);
            sb.delete(m.start(),m.end());
            doMatch(sb);
        }
        else{
            return;
        }

    }
    static String superReducedString(String s) {
        StringBuilder sb=new StringBuilder(s);
        doMatch(sb);
        String str=sb.toString();
        if(str.isEmpty()){str="Empty String";}
        return str;


    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(superReducedString(str));
    }
}


/*package whatever //do not write package name here */
package com.Practice;
import java.io.*;
import java.util.*;
import java.util.regex.*;
class Vowel {
    static void findVowel(StringBuilder s){
        String regex="[aeiouAEIOU]";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        if(m.find()){
            s.deleteCharAt(m.start());
            findVowel(s);
        }

    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder(str);
        findVowel(s);
        System.out.print(s);
    }
}
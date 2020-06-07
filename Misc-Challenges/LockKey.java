package com.Practice;

import java.util.*;
import java.util.regex.*;
public class LockKey {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=Integer.toString(n);
        char[] ch=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            while(ch[i]=='0'){
                sb1.append('0');
                i++;
            }
            sb.append(ch[i]);
        }
        String zeroes=sb1.toString();
        if(!zeroes.isEmpty()){
            sb.insert(1,zeroes);
        }
        System.out.println(sb);







    }
}
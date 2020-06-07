package com.Practice;

import java.util.*;
import java.util.regex.*;
public class EncryptionByLength {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        for(String str1:words){
            char[] temp=str1.toCharArray();
            int index=0;
            int len=temp.length;
            for(char cha:temp){
                int tempx=len-index-1;
                char charx=(char)((int)cha+tempx);

                if(charx>'z'||charx<'a')
                    charx=(char)((int)cha+tempx-26);
                temp[index]=charx;
                index++;
                System.out.print(charx);
            }

            System.out.print(" ");

        }

    }
}
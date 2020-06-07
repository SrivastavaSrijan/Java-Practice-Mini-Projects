package com.Practice;

import java.util.*;
public class Pattern2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start,end;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                start=((i*(i-1))/2+1);
                for(int j=1;j<=i;j++){
                    if(i==j){
                        System.out.print(start);
                        start++;
                    }
                    else{
                        System.out.print(start+"*");
                        start++;
                    }

                }
            }
            else{
                start=((i*(i+1))/2);
                for(int j=1;j<=i;j++){
                    if(i==j){
                        System.out.print(start);
                        start--;
                    }
                    else{
                        System.out.print(start+"*");
                        start--;
                    }

                }
            }
            System.out.println();
        }


    }

}

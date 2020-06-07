package com.Practice;

// You are using Java
import java.util.*;
public class Pattern1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<2*n;i++){
            if(i%2==0){continue;}
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=(2*n-2);i>0;i--){
            if(i%2==0){continue;}
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

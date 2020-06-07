package com.Practice;
// You are using Java
import java.util.*;
class Pattern3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start);
            }
            if(i!=n) start++;
            System.out.println();
        }
        for(int i=(n);i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(start);

            }
            start--;
            if(i!=0) System.out.println();
        }
    }

}

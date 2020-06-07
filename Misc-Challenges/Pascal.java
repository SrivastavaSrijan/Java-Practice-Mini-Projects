package com.Practice;
import java.util.*;
public class Pascal {
        static int fact(int num){
            int factorial;
            for(factorial=1;num>1;num--){
                factorial*=num;

            }
            return factorial;
        }
        static int ncr(int n,int r){
            return fact(n)/(fact(r)*fact(n-r));

        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            for(int i=0;i<n;i++){
                for(int j=0;j<n-i;j++){
                    System.out.print(" ");
                }

                for(int j=0;j<=i;j++){
                    System.out.print(" "+ncr(i,j));
                }
                System.out.println();
            }

        }

    }


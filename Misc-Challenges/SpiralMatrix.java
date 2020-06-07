// You are using Java
package com.Practice;
import java.util.*;
class SpiralMatrix{
    static void print(int a[][],int i,int j,int m,int n){
        if(i>=m||j>=n){
            return;
        }
        //Print first row
        for(int p=i;p<n;p++){
            System.out.print(a[i][p]+" ");
        }
        //Print last coloumn
        for(int p=i+1;p<m;p++){
            System.out.print(a[p][n-1]+" ");
        }
        //is first row same as last
        if((m-1)!=i){//Print last row
            for(int p=n-2;p>=j;p--){
                System.out.print(a[m-1][p]+" ");
            }
        }
        if((n-1)!=j){//Print first col
            for(int p=m-2;p>i;p--){
                System.out.print(a[p][j]+" ");
            }
        }
        print(a,i+1,j+1,m-1,n-1);


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] mat=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int temp=sc.nextInt();
                mat[i][j]=temp;
            }
        }
        print(mat,0,0,m,n);


    }

}

package com.Practice;

import java.io.*;
import java.util.*;

class RotateMatrix
{
    static void swapRows(int[][] m)
    {
        for (int i=0,k=m.length-1;i<k;++i,--k){
            int[] x=m[i];
            m[i]=m[k];
            m[k]=x;
        }
    }
    static void transpose(int[][] m)
    {
        for(int i=0;i<m.length;i++){
            for(int j=i;j<m[0].length;j++){
                int x=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=x;
            }
        }
    }

    // Function to print the matrix
    static void displayMatrix(int N,int M, int mat[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
                System.out.print(mat[i][j]+" ");

            System.out.print("\n");
        }

    }

    /* Driver program to test above functions */
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int flag=sc.nextInt();
        // Test Case 1
        int mat[][] = new int[N][M];
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++){
                mat[i][j]=sc.nextInt();
            }
        }

        if(flag==1){
            swapRows(mat);
            transpose(mat);
        }

        if(flag==0){
            transpose(mat);
            swapRows(mat);
        }

        // Print rotated matrix
        displayMatrix(N,M,mat);
    }
}
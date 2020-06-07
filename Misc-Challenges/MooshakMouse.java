package com.Practice;
import java.util.*;
public class MooshakMouse {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        //int M = sc.nextInt();
        //int flag=sc.nextInt();
        // Test Case 1
        int maze[][] = new int[N][N];
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++){
                maze[i][j]=sc.nextInt();
            }
        }

        HashSet<String> invalidSet = new HashSet<> ();
        boolean flg = isPath(maze, 0, 0, invalidSet);
        if(flg) System.out.println("Yes");
        else System.out.println("No");

    }

    public static boolean isPath(int[][] arr, int x, int y, HashSet<String> invalidSet){
        if(x<0||x>arr.length-1||y<0||y>arr[x].length-1){
            invalidSet.add(x+" "+y);
            return false;
        }
        if(arr[x][y]==0){
            invalidSet.add(x+" "+y);
            return false;
        }
        if(arr[x][y]==9){
            return true;
        }
        if(arr[x][y]==1 && !invalidSet.contains(x+" "+y)){
            invalidSet.add(x+" "+y);
            return isPath(arr,x-1,y,invalidSet)||isPath(arr,x+1,y,invalidSet)
                    ||isPath(arr,x,y-1,invalidSet)||isPath(arr,x,y+1,invalidSet);
        }
        return false;
    }
}


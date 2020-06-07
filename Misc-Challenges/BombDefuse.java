package com.Practice;
import java.util.*;

public class BombDefuse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        if(k>0){
            for(int i=0;i<n;i++){
                int temp=0;
                if((i+k)>=n){
                    Collections.rotate(list,-i);
                }
                /*list.forEach(f->System.out.print(f+" "));
                System.out.println();*/
                for(int j=1;j<=k;j++){
                    temp+=list.get(j);
                }
                Collections.rotate(list,i);
                output.set(i,temp);
            }
        }
        else{
            for(int i=0;i<n;i++){
                int temp=0;
                int kabs=Math.abs(k);
                if((i+k)<0){
                    Collections.rotate(list,-(i+1));
                }
                /*list.forEach(f->System.out.print(f+" "));
                System.out.println();*/
                for(int j=0;j<kabs;j++){
                    temp-=list.get(j);
                }
                Collections.rotate(list,(i+1));
                output.set(i,temp);
            }
        }


        output.forEach(f->System.out.print(f+" "));


    }

}


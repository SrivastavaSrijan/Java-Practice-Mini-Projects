package com.Practice;

import java.util.*;

public class House{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> hMap= new HashMap<>();
        List<Integer> postions=new ArrayList<>();
        List<Integer> sizes=new ArrayList<>();
        for(int i=0;i<n;i++){
            hMap.put(sc.nextInt(),sc.nextInt());
        }
        //System.out.print(hMap);
        for(int i:hMap.values()){
            postions.add(i);
        }
        int query1=0;
        int query2=0;
        Collections.sort(postions);
        int maxSize=Integer.MIN_VALUE;
        for(int i=0;i<postions.size()-1;i++){
            int x=postions.get(i+1);
            int y=postions.get(i);
            int temp=x-y;

            sizes.add(temp);
            if(temp>maxSize){
                query1=x;
                query2=y;
                maxSize=temp;
            }
        }

        Iterator<Map.Entry<Integer,Integer>> it= hMap.entrySet().iterator();
        int x=0,y=0;
        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry=it.next();
            if(entry.getValue()==query1){
                x=entry.getKey();
            }
            if(entry.getValue()==query2){
                y=entry.getKey();
            }

        }


        System.out.print(x+" "+y);

    }

}


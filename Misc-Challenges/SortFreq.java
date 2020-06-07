package com.Practice;
import java.util.*;
class SortComparator implements Comparator<Integer>{
    private final Map<Integer,Integer> hMap;
    SortComparator(Map<Integer,Integer> tFreqMap){
        this.hMap=tFreqMap;
    }

    @Override
    public int compare(Integer i1,Integer i2){
        int freqCom=hMap.get(i2).compareTo(hMap.get(i1));
        int valueCom=i1.compareTo(i2);
        if(freqCom==0)
            return valueCom;
        else
            return freqCom;
    }

}
public class SortFreq{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> hMap= new HashMap<>();
        List<Integer> list=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i:list){
            int count=hMap.getOrDefault(i,0);
            hMap.put(i,count+1);
            output.add(i);
        }
        SortComparator sortOrder=new SortComparator(hMap);
        Collections.sort(output,sortOrder);
        output.forEach(f->System.out.print(f+" "));


    }

}


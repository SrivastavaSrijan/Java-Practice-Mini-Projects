package com.Practice;
import java.util.*;
import java.util.Map.Entry;
public class sortBitCount {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> hMap= new HashMap<>();
        for(int i=0;i<n;i++){
            Integer temp=sc.nextInt();
            hMap.put(temp,Integer.bitCount(temp));
        }
        int k=sc.nextInt();
        Comparator<Entry<Integer,Integer>> comp=new Comparator<Entry<Integer,Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
                int temp = e2.getValue().compareTo(e1.getValue());
                if (temp == 0) {
                    return e2.getKey().compareTo(e1.getKey());
                }
                return temp;

            }
        };
        Set<Entry<Integer,Integer>> entries=hMap.entrySet();
        List<Entry<Integer,Integer>> listOf=new ArrayList<Entry<Integer,Integer>>(entries);
        Collections.sort(listOf,comp);
        Map<Integer,Integer> sorted=new LinkedHashMap<>();
        for(Entry<Integer,Integer> entry:listOf){
            sorted.put(entry.getKey(),entry.getValue());
        }
        for(int i=0;i<k;i++){
            System.out.print(sorted.keySet().toArray()[i]+" ");
        }
    //System.out.println(hMap)System.out.println(sorted);





    }
}
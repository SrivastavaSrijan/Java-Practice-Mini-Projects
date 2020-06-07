package com.Practice;
// You are using Java
import java.util.*;
class LightOn{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=sc.nextInt();
        int ans=0;
        List<Integer> list=new ArrayList<>();
        List<Integer> state=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            state.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            int sum=0;
            int compCount=0;
            boolean light=false;
            while(sum<l){
                sum+=list.get(i);
                compCount++;
            }
            int lastIndex=i;
            for(int j=0;j<i;j++){
                if(state.get(j)==1){
                    light=true;
                }
            }
            if(!light){
                ans+=compCount;
            }
        }
    System.out.print(ans);
    }
}
/*7 10
5 3 4 5 9 9 9
1 0 0 0 1 0 0*/
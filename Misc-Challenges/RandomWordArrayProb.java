package com.Practice;
import java.util.*;
import java.util.regex.*;
public class RandomWordArrayProb {

        static int count(int arr[], int noe, int num){
            if (num==0)
                return 1;
            if (num<0)
                return 0;
            if(noe<=0 && num >=1)
                return 0;
            return count(arr,noe-1,num)+count(arr,noe,num-arr[noe-1]);

        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int m=sc.nextInt();
            char[] seq=new char[m];
            seq=sc.next().toCharArray();
            int[] arr=new int[m];
            int point=0;
            for(char cha:seq)
                arr[point++]=(int)cha-96;

            int total,index;
            List<String> listWords=new ArrayList<String>();
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
                listWords.add(sc.next());
            }
            List<Integer> listWeight=new ArrayList<>();
            for(String str:listWords){
                int x=str.length();
                char[] word=new char[x];
                word=str.toCharArray();
                int ind=0,nof=0,sum=1;
                for(int i=0;i<x;i++){
                    for(ind = 0,nof=0 ; ind< x ; ind++)
                        if((word[i]-96) % arr[ind] == 0 )
                            nof++;
                    total  = count(arr,word[i]-96,arr[i]-96);
                    //System.out.print(total+" ");// total=count(arr,4,4);               // printf("%d ",total);//+(total -nof));
                    sum=sum*(total +(total -nof));
                }
                listWeight.add(sum);
            }
            listWeight.forEach(f->System.out.print(f));
            //listWords.forEach(f->System.out.print(f));
        }

    }



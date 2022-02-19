##Input
[9,9,9]
[1]
##output
1000

import java.util.*;
public class Arraysum{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr1[]={999};
    int arr2[]={1};
    int p=1;
    int c=0;
    int n1=arr1.length;
    int n2=arr2.length;
    int sum[]=new int[n1>n2?n1:n2];
    int i=arr1.length-1;
    int j=arr2.length-1;
    int k=sum.length-1;
    while(k>=0){
        int d=0;
        d=d+c;
        if(i>=0){
            d=d+arr1[i];
        }
        if(j>=0){
            d=d+arr2[j];
        }
        c=d/10;
        d=d%10;
        sum[k]=d;
        k--;
        i--;
        j--;
    }
    if(c!=0){
        System.out.print(c);
        
    }
    
    for(int val:sum){
        System.out.print(val);
    }
    }

}

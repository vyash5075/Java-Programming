##input
999
1000
##output
1

import java.util.*;
public class Subtraction{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr1[]={9,9,9};
    int arr2[]={1,0,0,0};
    int p=1;
    int c=0;
    int n1=arr1.length;
    int n2=arr2.length;
    int diff[]=new int[n2];
    int i=arr1.length-1;
    int j=arr2.length-1;
    int k=diff.length-1;
    
    while(k>=0){
        int d=0;
        int a1v=i>=0?arr1[i]:0;
        if(arr2[j]+c>=a1v){
            d=arr2[j]+c-a1v;
            c=0;
            
        }
        else{
            d=arr2[j]+c+10-a1v;
            c=-1;
        }
      
        diff[k]=d;
        i--;
        j--;
        k--;
        
    }
    int idx=0;
    while(idx<diff.length){
        if(diff[idx]==0){
            idx++;
        }
        else{
            break;
        }
    }
     
    
    while(idx<diff.length){
        System.out.print(diff[idx]);
        idx++;
    }
    }

}

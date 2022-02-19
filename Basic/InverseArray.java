##Input
{4,1,2,0,3};

##output
3,1,2,4,0,

import java.util.*;
public class Inverse{
    
    
    public static int[] inverse(int arr[]){
      
       int inv[]=new int[arr.length];
       for(int i=0;i<arr.length;i++){
           int pos=arr[i];
           inv[pos]=i;
       }
       return inv;
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr1[]={4,1,2,0,3};
    
   int inv[]= inverse(arr1);
    
    for(int rev1:inv){
        System.out.print(rev1+",");
    }
    }

}

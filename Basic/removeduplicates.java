##Input
1,2,2,3,3,4,5
##output
1,2,3,4,5

//for sorted array

import java.util.*;
public class removeduplicates{
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,5,5};
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        j++;
         
      
        for(int i=0;i<j;i++){
            System.out.print(temp[i]+",");
        }
    }
}

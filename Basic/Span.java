##input
9
2,4,2,5,6,77,2,3,4,
##output
75

import java.util.*;
public class Span{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,2,5,6,77,2,3,4,};
        int min=arr[0];
        int max=arr[0];
          for(int i=0;i<arr.length;i++){
              if(arr[i]>max){
                  max=arr[i];
              }
              if(arr[i]<min){
                  min=arr[i];
              }
          }
       int span=max-min;
       System.out.println(span);
    }
}

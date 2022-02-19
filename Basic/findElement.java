##input
344930934
3
##output
7

import java.util.*;
public class Array{
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,2,5,6,77,2,3,4,};
        System.out.println("Enter the Element to find");
        int e=sc.nextInt();
        int k=-1;
        
          for(int i=0;i<arr.length;i++){
            if(arr[i]==e){
                k=i;
            }   
          }
        if(k==-1){
            System.out.println("Element does not present in given array");
        }
        else{
            System.out.println("Element is prsent at "+k + "position");
        }
    }
}

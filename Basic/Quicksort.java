## middle pivot element

import java.util.*;
public class quicksort{
    public static void main(String args[]){
        int arr[]={15,9,7,13,12,16,4,18,11};
        int n=arr.length;
        quicksortrecursion(arr,0,arr.length-1);
        printarray(arr);
        
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[(low+high)/2];
        while(low<=high){
           while(arr[low]<pivot){
                low++;
            }
            while(arr[high]>pivot){
                high--;
            }
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
            
        }
        return low;
        
    }
    public static void quicksortrecursion(int arr[],int low,int high){
      int pi=  partition(arr,low,high);
      if(low<pi-1){
          quicksortrecursion(arr,low,pi-1);
      }
      if(pi<high){
             quicksortrecursion(arr,pi,high);
      }
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            
            System.out.println(arr[i]);
        }
    }
}

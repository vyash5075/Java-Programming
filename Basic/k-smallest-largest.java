##Input
{5,10,7,67,8,89,45};
k=2
##output
smallest=7, largest=67


import java.util.*;
public class smallestlargest{
       public static int[] bsort(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       
    }
 
     return arr;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={5,10,7,67,8,89,45};
        int k=2;
        int sortedarr[]=bsort(arr);
        System.out.println("Smallest element is"+sortedarr[1]+", Largest element is "+sortedarr[arr.length-2]);
        }
    
}



//optimised approach
import java.util.*;
public class ksmallestlargest{
       
     
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={5,10,7,67,8,89,45};
        int k=2;
        
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        
        
         int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest&&arr[i]!=largest){
                secondlargest=arr[i];
            }
            if(arr[i]<smallest){
             
                secondsmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secondsmallest&&arr[i]!=smallest){
                secondsmallest=arr[i];
            }
        }
        
        System.out.println("Smallest element is"+ secondsmallest+", Largest element is "+secondlargest);
        }
    
}


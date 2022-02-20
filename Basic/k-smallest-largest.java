##Input
{5,10,7,67,8,89,45};
k=2
##output
smallest=7, largest=67


import java.util.*;
public class JaggedArray{
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

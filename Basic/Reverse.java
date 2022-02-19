##input
[10,20,30,40,50]
##output
[50,40,30,20,10]

import java.util.*;
public class Bargraph{
    public static int[] reverse(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
       return arr; 
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr1[]={10,20,30,40,50};
    int rev[]=reverse(arr1);
    
    for(int rev1:rev){
        System.out.print(rev1+",");
    }
    }

}

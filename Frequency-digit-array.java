##Input
487849574
4
##output
3

import java.util.*;
public class Frequency{
    public static int frequency(int arr[],int frequencydigit){
     int rv=0;
      for(int i=0;i<arr.length;i++){
          if(arr[i]==frequencydigit){
              rv++;
          }
      }
     return rv;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,4,2,5,6,77,2,3,4,};
         System.out.println("Enter the digit to find frequency");
        int frequencydigit=sc.nextInt();
        System.out.println(frequency(arr,frequencydigit));
    }
}

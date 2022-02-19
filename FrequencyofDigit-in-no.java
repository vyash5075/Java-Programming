##Input
394834
##output
3

import java.util.*;
public class Frequency{
    public static int frequency(int n,int frequencydigit){
     int rv=0;
     while(n>0){
         int r=n%10;
         n=n/10;
         if(r==frequencydigit){
             rv++;
         }
     }
     return rv;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no");
        int n=sc.nextInt();
         System.out.println("Enter the digit to find frequency");
        int frequencydigit=sc.nextInt();
        System.out.println(frequency(n,frequencydigit));
    }
}

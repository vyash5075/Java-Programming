##Input
153
##output
Armstrong no


import java.util.*;
public class Armstrongno{
    public static void main(String args[]){
         int n=1353;
         int result=0;
         int temp=n;
         int length=0;
         while(temp>0){
             temp=temp/10;
             length++;
         }
         System.out.println(length);
         int k=n;
         while(k>0){
             int rem=k%10;
             k=k/10;
             result=result+(int)Math.pow(rem,length);
              
         }
         if(result==n)
         System.out.println(n + " is a Armstrong no.");
         else
         System.out.println(n+" Not a armstrong no");
    }
}

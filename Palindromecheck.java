##Input
121
##output
true

import java.util.*;
public class palindrome{
    public static void main(String args[]){
        int n=1211;
        int temp=n;
        int r=0;
        while(temp>0){
            int rem=temp%10;
            temp=temp/10;
            r=r*10+rem;
            
        }
        if(n==r){
            System.out.println(n +" is palindrome");
        }
        else{
         System.out.println(n +" is not  palindrome");
        }
    }
}

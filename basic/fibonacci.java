##input
8
##outptut
0,1,1,2,3,5,8,13,


import java.util.*;
 public class fibonacciseries{
     public static void main(String args[]){
         int a=0;
         int b=1;
         fibonacci(a,b,8);
     }
     public static void fibonacci(int a,int b, int i){
     if(i==0){
         return ;
     }
     else{
         System.out.print(a+",");
         int c=a+b;
         a=b;
         b=c;
         fibonacci(a,b,i-1);
     }
     return;
 }
 }

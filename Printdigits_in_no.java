##input
987
##output
9
8
7
import java.util.*;
public class printno{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of fibonacci no you want to print");
        int n=sc.nextInt();
        int k=n;
       int count=0;
       while(k!=0){
           count++;
           k=k/10;
       }
       int div=(int)Math.pow(10,count-1);
       while(div!=0){
           int result=n/div;
           System.out.println(result);
           n=n%div;
           div=div/10;
           
       }
       
       
    }
}

##input
789
##output
987
import java.util.*;
public class Inverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of fibonacci no you want to print");
        int n=sc.nextInt();
        int k=0;
       int count=0;
       while(n!=0){
           int result=n%10;
           k=k*10+result;
        
           n=n/10;
       }
          System.out.println(k);
       
       
    }
}

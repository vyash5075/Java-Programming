##input
789
##output
987
import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of fibonacci no you want to print");
        int n=sc.nextInt();
        int k=n;
       int count=0;
       while(n!=0){
           int result=n%10;
           System.out.println(result);
           n=n/10;
       }
       
       
    }
}

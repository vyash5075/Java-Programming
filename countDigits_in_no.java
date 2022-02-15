##input
1000
#output
4
import java.util.*;
public class countdigits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of fibonacci no you want to print");
        int n=sc.nextInt();
       int count=0;
       while(n!=0){
           count++;
           n=n/10;
       }
       System.out.print(count);
    }
}

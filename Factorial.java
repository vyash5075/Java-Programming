##input
5
##output
120
import java.util.*;
public class factorial{
    public static int factorial(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res=res*i;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to find factorial");
        int n=sc.nextInt();
        System.out.println(factorial(n));
    }
}

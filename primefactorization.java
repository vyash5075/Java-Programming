##input
24
##output
2
2
2
3
import java.util.*;
public class primefactorization{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}

##Input
1172
8
##Output
634
import java.util.*;
public class numbersystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(conversion(n,base));
    }
    public static int conversion(int n,int base){
        int result=0;
        int p=1;
        while(n>0){
            int dig=n%10;
            n=n/10;
            result+=dig*p;
            p=p*base;
        }
        return result;
    }
}

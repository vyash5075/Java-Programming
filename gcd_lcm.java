##input
24
36
##output
gcd=12
lcm=72
import java.util.*;
public class gcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int on1=n1;
        int on2=n2;
        while(n1%n2>0){
            int r=n1%n2;
            n1=n2;
            n2=r;
        }
        int gcd=n2;
        System.out.println(gcd);
        int lcm=(on1*on2)/gcd;
        System.out.println(lcm);
    }
}

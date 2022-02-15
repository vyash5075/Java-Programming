##input
21453
##output
23154
import java.util.*;
public class inverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int inv=0;
        int op=1;
        while(n!=0){
            int ip=n%10;
            int id=op;
            inv=inv+id*(int)Math.pow(10,ip-1);
            n=n/10;
            op++;
        }
        System.out.println(inv);
    }
}

##Input
236
754
8
##output
1212

import java.util.*;
public class numbersystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(addition(n1,n2,base));
    }
    public static int addition (int n1,int n2,int base){
        int rv=0;int p=1;
        int carr=0;
        while(n1>0||n2>0||carr>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=d1+d2+carr;
            
            carr=d/base;
            d=d%base;
            rv=rv+d*p;
            p=p*10;
            
        }
        return rv;
    }
    
    
}

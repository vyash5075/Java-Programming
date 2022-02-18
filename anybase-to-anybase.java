##input
172
8
2
##output
1111010

import java.util.*;
public class numbersystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int base=sc.nextInt();
        int conversionbase=sc.nextInt();
        System.out.println(conversion(n,base,conversionbase));
    }
    
    
    public static int conversion(int n,int base,int conversionbase){
        int r=anybasetodecimal(  n, base);
        int k=decimaltoanybase(r,conversionbase);
        return k;
    }
 public static int anybasetodecimal(int n,int base){
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
    public static int decimaltoanybase(int n,int base){
        int result=0;
        int p=1;
        while(n>0){
            int dig=n%base;
            
            n=n/base;
            result+=dig*p;
            p=p*10;
        }
        return result;
    }
}

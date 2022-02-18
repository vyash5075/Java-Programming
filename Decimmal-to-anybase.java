##input
57
2
##output
11

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
            int dig=n%base;
            System.out.println(dig+" ,"+n +","+base);
            n=n/base;
            result+=dig*p;
            p=p*10;
        }
        return result;
    }
}

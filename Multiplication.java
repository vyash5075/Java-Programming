##input
234
76
8
##output
22710
import java.util.*;
public class numbersystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(getProduct(n1,n2,base));
    }
    public static int getProduct(int n1,int n2,int b){
        int rv=0;
        int p=1;
        while(n2>0){
            int d2=n2%10;
            n2=n2/10;
          int result= getproductwithsingledigit(n1,d2,b);
          result=result*p;
          p=p*10;
            rv=addition(rv,result,b);
        }
        return rv;
        
    }
    public static int getproductwithsingledigit(int n1,int d2,int base){
        int rv=0;
        int c=0;
        int p=1;
        while(n1>0||c>0){
            int d1=n1%10;
            n1=n1/10;
            int d=d1*d2+c;
            c=d/base;
            d=d%base;
            rv=rv+(d)*p;
            p=p*10;
            
            
        }
        return rv;
        
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

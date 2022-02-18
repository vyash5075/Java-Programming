##Input
236
1212
8
##output
734
import java.util.*;
public class numbersystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int base=sc.nextInt();
        System.out.println(Subtraction(n1,n2,base));
    }
    public static int Subtraction (int n1,int n2,int base){
        int rv=0;int p=1;
        int carr=0;
        while(n2>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=0;
           
            if(d2+carr>=d1){
                
                d=(d2+carr)-d1;
                carr=0;
                   
            }
            else{
                d2=d2+carr+base;
                carr=-1;
                d=d2-d1;
            
            }
           
    
            rv=rv+d*p;
            
            p=p*10;
            
        }
        return rv;
    }
    
    
}

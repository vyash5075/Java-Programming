##input 
5
##output
not prime

import java.util.*;
public class primecheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count>0){
            System.out.println("not prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}

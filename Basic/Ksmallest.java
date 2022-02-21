
import java.util.*;
public class Ksmallest{
       
     
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={5,8,12,7,6,2,4};
        int k=3;
         for(int i=0;i<a.length-1;i++){
             for(int j=i+1;j<a.length;j++){
                 if(a[i]<a[j]){
                     int temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                 }
             }
             if(k==i-1){
                 System.out.print(a[i]);
                 break;
             }
         }
        
    }
    
}

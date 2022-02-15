##input
10
20
##output
11,13,17,19
  import java.util.*;
public class primecheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         int low=sc.nextInt();
         int high=sc.nextInt();
         for(  int no=low;no<high;no++){
             int count=0;
             
             for(int i=2;i*i<=no;i++){
                 if(no%i==0){
                     count++;
                     break;
                 }
                 else{}
             }
             if(count==0){
                  System.out.println(no+",");
             }
         }
    }
}

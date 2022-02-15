##input
3
4
5
##output
true
import java.util.*;
public class pythagoreantriplet{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int max=n1;
        if(n2>max){
            max=n2;
        }
          if(n3>max){
            max=n3;
        }
      
        if(max==n1){
            boolean ispythagoreantriplet=(n1*n1==(n2*n2+n3*n3));
            System.out.println(ispythagoreantriplet);
        }
        else if(max==n2){
            boolean ispythagoreantriplet=(n2*n2==(n1*n1+n3*n3));
            System.out.println(ispythagoreantriplet);
        }
        else{
             boolean ispythagoreantriplet=((n3*n3)==((n1*n1)+(n2*n2)));
            System.out.println(ispythagoreantriplet);
        }
    }
}

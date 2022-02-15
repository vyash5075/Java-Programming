##input
7
##output
0,1,1,2,3,5,8
  
  import java.util.*;
public class fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of fibonacci no you want to print");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" , ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}

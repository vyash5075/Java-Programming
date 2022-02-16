##input
49
##output
4,9,16,25,36,49
import java.util.*;
public class benjaminbulbs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        for(int i=0;i*i<=n1;i++){
            System.out.print(i*i+",");
        }
    }
}

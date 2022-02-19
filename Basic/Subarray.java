##input
{1,2,3,4}
##output
1
12
123
1234
2
23
234
3
34
4




import java.util.*;
public class subarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4};
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]);
                }
                System.out.println();
            }
        }
    }
}

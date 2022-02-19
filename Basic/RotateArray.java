##input
[10,20,30,40,50]
1
##output
[50,10,20,30,40]
import java.util.*;
public class Rotate{
    public static int[] reverse(int arr[],int i,int j){
       
        int li=i;
        int ri=j;
        while(li<ri){
            int temp=arr[li];
            arr[li]=arr[ri];
            arr[ri]=temp;
            li++;
            ri--;
        }
       return arr; 
    }
    
    public static void rotate(int a[],int k){
      
        if(k<a.length){
            k=k+a.length;
        }
          k=k%a.length;
        //part1
        reverse(a,0,a.length-k-1);
        
        //part2
        reverse(a,a.length-k,a.length-1);
        
        //all
          reverse(a,0,a.length-1);
    }
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr1[]={10,20,30,40,50};
    int rotate=sc.nextInt();
    rotate(arr1,rotate);
    
    for(int rev1:arr1){
        System.out.print(rev1+",");
    }
    }

}

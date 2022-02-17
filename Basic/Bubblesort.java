##input
5
3
1
3
4
5
##output
1 3 3 4 5 
  
  
  import java.util.*;

public class bubblesort{
    public static int[] bsort(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       
    }
 
     return arr;
}
public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+", ");
    }
}

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of Elements");
        int n=sc.nextInt();
        System.out.println("Enter Items");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int  sortedarr[]=bsort(arr);
        print(arr);
    }
}

import java.util.*;
public class duplicate {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no. of entries");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[100];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr2[arr[i]]=arr2[arr[i]]+1;
        }
        System.out.println("duplicate no. are");
        for(int i=0;i<n;i++)
        {
            if(arr2[arr[i]]>1)
            {
                System.out.println(arr[i]);
                arr2[arr[i]]=0;
            }
        }
    }
}

import java.util.*;
public class duplicatefrequency {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of entries");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int arr2[]=new int[1000];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
       arr2[arr[i]]=arr2[arr[i]]++;
    }

    System.out.println("frequency of duplicate elements are");
    for(int i=0;i<10;i++)
        System.out.println(i);
    for(int i=0;i<n;i++)
    {
        if(arr2[arr[i]]>1)
        {
            System.out.println("duplicate no. is "+arr[i]+"frequency is "+arr2[arr[i]]);
            arr2[arr[i]]=0;
        }
    }
    
}
}

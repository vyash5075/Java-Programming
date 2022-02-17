#input
5
[1,2,3,4,5]
1
##output
present

import java.util.*;
public class linearsearch {
    public static int search(int a[],int key)
    {
        int n=a.length;              // here length is not a function its an attribute
        for(int i=0;i<n;i++)     
        {
            if(a[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element u want to search");
        int key=sc.nextInt();
        int index=search(a,key);
        if(index!=-1)
        {
            System.out.println("element is present at position "+index);
        }
        else{
            System.out.println(key+" does not exist");
        }
    }
}

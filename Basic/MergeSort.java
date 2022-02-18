import java.util.*;
public class mergesort {
    int array[];          //declared globally
    int temparray[];      // declared globally
    int length;            // declared globally
    public void sort(int arr[])
    {
         this.array=arr;
         this.length=arr.length;
        this. temparray=new int[length];
         divide(0,length-1);
    }
    public void divide(int lowerindex,int higherindex)
    {
        if(lowerindex<higherindex)
        {
            int mid=lowerindex+(higherindex-lowerindex)/2;
            divide(lowerindex,mid);         //recursion
            divide(mid+1,higherindex);      //recursion
            merge(lowerindex,mid,higherindex);
        }
    }
    public void merge(int lowerindex,int mid,int higherindex)
    {
        for(int i=lowerindex;i<=higherindex;i++)
        {
            temparray[i]=array[i];
        }
        int i=lowerindex;
        int j=mid+1;
        int k=lowerindex;
        while(i<=mid&&j<=higherindex)
        {
            if(temparray[i]<=temparray[j])
            {
                array[k]=temparray[i];
                i++;
            }
            else
            {
                array[k]=temparray[j];
                j++;
            }   
            k++;
        }
        while(i<=mid)
        {
         array[k]=temparray[i];
         i++;
         k++;
        }
    }
           
    
  public static void main(String args[])
  {
      int n;
      System.out.println("enter the size of array");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      mergesort ms=new mergesort();
      ms.sort(arr);
      System.out.println("after sorting");
      for(int i:arr)
      {
          System.out.println(i);
      }
  }
}

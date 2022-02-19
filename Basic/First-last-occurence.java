##input
10,20,20,30,40,50,50
20

##output
1,2

 import java.util.*;
   public class newbie {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
          int arr[]={4,1,0,2,3};
          int max=arr[0];
          int d=2;
         firtlastoccurence(arr,2);
         
    }
        public static void firtlastoccurence(int arr[],int data){
            int lo=0;
            int hi=arr.length-1;
            int fi=-1;
            int li=-1;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                if(data>arr[mid]){
                    lo=mid+1;
                }
                else if(data<arr[mid]){
                    hi=mid-1;
                }
                else{
                    fi=mid;
                    hi=mid-1;
                }
            }
            System.out.println("first index "+fi);
             lo=0;
             hi=arr.length-1;
             
             li=-1;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                if(data>arr[mid]){
                    lo=mid+1;
                }
                else if(data<arr[mid]){
                    hi=mid-1;
                }
                else{
                    li=mid;
                    lo=mid+1;
                }
            }
            System.out.println("last occurence "+li);
        }
        
       
          
     }

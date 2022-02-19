
##Input
10,20,30,40,50
34
##output
floor=30
ceil=40

   import java.util.*;
    public class newbie {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
          int arr[]={1,2,4,5,6};
           
          int data=4;
        
          int lo=0;
          int ceil=0;
          int floor=0;
          int hi=arr.length-1;
         while(lo<=hi){
             int mid=(lo+hi)/2;
             if(data<arr[mid]){
                hi=mid-1;
                ceil=arr[mid];
             }
             else if(data>arr[mid]){
                
                 lo=mid+1;
        
                 floor=arr[mid];
                 
             }
             else{
                   floor=arr[mid];
                    ceil=arr[mid];
                    break;
             }
             
         }
         System.out.println("ceil"+ceil);
         System.out.println("floor"+floor);
    }
        
       
          
     }

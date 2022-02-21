##Input
{23,0,24,4,5,2,26,1,27,3,9,28};
##output
6

import java.util.*;
public class abc{
    public static void main(String args[]){
        int ar[]={23,0,24,4,5,2,26,1,27,3,9,28};
        HashSet<Integer>hs=new HashSet<Integer>();
        for(int i=0;i<ar.length;i++){
            hs.add(ar[i]);
        }
         
        
        int longestsub=1;
        for(int i=0;i<ar.length;i++){
            int longest=0;
            if(!hs.contains(ar[i]-1)){
                int no=ar[i];
               
                while(hs.contains(no)){
                    no++;
                }
               
                 longest=no-ar[i];
            }
           
             
            if(longest>longestsub){
                
                longestsub=longest;
            }
        }
        System.out.println("maximum consecutive subsequence length is"+longestsub);
    }
}

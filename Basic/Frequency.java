##Input
[1,2,1,3,4]
##output
1-2
2-1
3-1
4-1

import java.util.*;
public class array{
       
     
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={3,5,4,3,2,2,3,1};
        
         Map<Integer,Integer>hm=new HashMap<Integer,Integer>();
         for(int no:a){
             if(hm.containsKey(no)){
                 hm.put(no,hm.get(no)+1);
             }
             else{
                 hm.put(no,1);
             }
         }
         
         
         for(Map.Entry m:hm.entrySet()){
               
            
            System.out.println(m.getKey()+" "+m.getValue());    

         }
    }
}

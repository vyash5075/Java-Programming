#Input
[2,4,3,6,4,2,6]
##output
2,4,6



// brute force method worst approach
import java.util.*;
public class duplicate{
       
     
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={3,5,4,3,2,2,3,1};
        
         for(int i=0;i<a.length-1;i++){
             for(int j=i+1;j<a.length;j++){
                 if(a[i]==a[j]&&i!=j){
                     System.out.println(a[j]);
                 }
    }
         }
    }
}



//using hashset

import java.util.*;
public class array{
       
     
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={3,5,4,3,2,2,3,1};
        
        Set<Integer>s=new HashSet<Integer>();
         for(int no:a){
             if(s.add(no)==false){
                System.out.print(no);
             }
             else{
                  s.add(no);
             }
             
         }
    }
}



//using hashmap

import java.util.*;
public class array{
       
     
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={3,5,4,3,2,2,3,1};
        
         Map<Integer,Integer>hm=new HashMap< Integer,Integer >();
         for(int no:a){
             if(hm.containsKey(no)){
                 hm.put(no,hm.get(no)+1);
             }
             else{
                 hm.put(no,1);
             }
         }
         
         
         for(Map.Entry m:hm.entrySet()){
              int k =(int) m.getValue();
               
             if(k>1){
                 System.out.println(m.getKey());
             }
            
            
         }
    }
}


//using hashtable

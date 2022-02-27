##Input
Hi Ie em yashm Verema
##output
m

import java.util.*;
public class maximumfrequency{
    public static void main(String args[]){
        String s="Hi Ie em yashm Verema";
        s=s.replaceAll("\\s","");
        int arr[]=new int[256];
        char c=' ';
        int max=-1;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
 
        }
        
        for(int i=0;i<s.length();i++){
            if(max<arr[s.charAt(i)]){
                 max=arr[s.charAt(i)];
                c=s.charAt(i);
            }
        }
        System.out.println(c);
    }
}


case2:  By Hashmap

import java.util.*;
public class maximumfrequency{
    public static void main(String args[]){
        String s="Hi I em ymashm Verema";
        s=s.replaceAll("\\s","");
        int arr[]=new int[256];
        char c=' ';
        int max=-1;
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        
        
          for(Map.Entry<Character,Integer> m:hm.entrySet()){ 
              int cm=m.getValue();
              if(max< cm){
                  max=cm;
                  c=m.getKey();
              }
             
               
              
  }  
        System.out.println(c);
    }
}

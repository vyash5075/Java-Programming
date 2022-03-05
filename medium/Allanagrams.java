##Input
bcdcbabcba
##output
cba
abc
cba

import java.util.*;
public class AllAnagrams{
    public static void main(String args[]){
        String s="bcdcbabcba";
        String pattern="abc";
        
         checksubstringpresent(s,pattern);
        
         
    }
    public static void checksubstringpresent(String s,String pattern){
        Map<Character,Integer>hm=new HashMap<Character,Integer>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            
            hm.put(c,hm.getOrDefault(c,0)+1);
            
        }
            int matchedElement=0;
            int start=0;
            
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                
                if(hm.containsKey(ch)){
                    hm.put(ch,hm.get(ch)-1);
                    if(hm.get(ch)==0){
                        matchedElement++;
                    }
                }
                if(matchedElement==pattern.length()){
                    System.out.println(s.substring(i-pattern.length
                    ()+1,i+1));
                    
                }
                
                if(i>=pattern.length()-1){
                    char exp=s.charAt(start++);
                    if(hm.containsKey(exp)){
                        if(hm.get(exp)==0){
                          matchedElement--;  
                        }
                         hm.put(exp,hm.get(exp)+1);
                    }
                }
                
            
        }
        return ;
    }
}

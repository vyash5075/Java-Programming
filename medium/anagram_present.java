##Input
s=bcdcbaba
pattern=abc

##output
true
anagram of abc is present in s.

import java.util.*;
public class chk_ptrn_as anagram_present{
    public static void main(String args[]){
        String s="bcdcbaba";
        String pattern="abc";
        
         System.out.println(checksubstringpresent(s,pattern));
        
         
    }
    public static boolean checksubstringpresent(String s,String pattern){
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
                    return true;
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
        return false;
    }
}

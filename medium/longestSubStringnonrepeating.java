##Input
abcdae
##output
bcdae

import java.util.*;
public class longestSubString{
    public static void main(String args[]){
        String s="abcdae";
        System.out.println(longest(s));
    }
    public static String longest(String str){
        HashSet<Character>hs=new HashSet<>();
        
            String longestOverall="";
        for(int i=0;i<str.length();i++){
             String longestTillNow="";
            for(int j=i;j<str.length();j++){
            char c=str.charAt(j);
           
            if(hs.contains(c)){
                
                hs.clear();
                break;
            }
            else{
                 longestTillNow+=c;
            hs.add(c);
           
            }
           
            }
             if(longestOverall.length()<longestTillNow.length()){
             longestOverall=  longestTillNow;
             
            }
            longestTillNow="";
            
          
        }
        return longestOverall;
    }
}

##Input
badccbacd
##output
4bacd

import java.util.*;
public class longestsubstringwithnonrepeatingcharacters{
    public static void main(String args[]){
        int k=2;
        String s="badccbacd";
        System.out.println(getlongest(s,k));
    }

    
    public static int getlongest(String str,int k){
        if(str==null||str.length()==0||k<1||k>str.length()){
            return -1;
        }
        int start=0;
        int end=0;
        int maxlength=0;
        int finalStart=0;
        int finalEnd=0;
        
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
       while(end<str.length()){
            char c=str.charAt(end);
            
            if(hm.containsKey(c)){
                start=Math.max(start,hm.get(c)+1);
            }
            hm.put(c,end);
        maxlength=Math.max(end-start+1,maxlength);
            
            end++;
        }
      
        return maxlength;
    }
}

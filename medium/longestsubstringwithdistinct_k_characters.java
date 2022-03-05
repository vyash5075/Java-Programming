##Input
k=2
s=bccbababd
##output
5
babab

import java.util.*;
public class longestsubstringwithdistinctkcharacters{
    public static void main(String args[]){
        int k=2;
        String s="bccbabaabd";
        System.out.println(getlongest(s,k));
    }
    public static int getlongest(String str,int k){
        if(str==null||str.length()==0||k<1||k>str.length()){
            return -1;
        }
        int start=0;
        int end=0;
        int maxlength=0;
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
            while(hm.size()>k){
                char frontchar=str.charAt(start);
                hm.put(frontchar,hm.get(frontchar)-1);
                 if(hm.get(frontchar)==0){
                     hm.remove(frontchar);
                 }
                 start++;
            }
           maxlength=Math.max(end-start+1,maxlength);
            
            end++;
        }
        return maxlength;
    }
}

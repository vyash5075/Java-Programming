##Input
badccbacd
##output
4bacd

time complexity=0(1)
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





//another approach easy asswell
time complexity=0(1)


import java.io.*;
 
public class GFG {
    public static int longestUniqueSubsttr(String str)
    {
        String finals="";
        String test = "";
  
        int maxLength = -1;
 
      
        if (str.isEmpty()) {
            return 0;
        }
        
        else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);
 
            
            if (test.contains(current)) {
                 
                test = test.substring(test.indexOf(current)
                                      + 1);
                                      
                                      
            }
            test = test + String.valueOf(c);
             
            if(test.length()>maxLength){
                 maxLength = Math.max(test.length(), maxLength);
                 finals=test;
                 
            }
           
        }
    System.out.println(finals);
        return maxLength;
    }

    public static void main(String[] args)
    {
        String str = "geeksforgeeks";
         
        int len = longestUniqueSubsttr(str);
        System.out.println(
                            
                             "substring is " + len);
    }
}
 

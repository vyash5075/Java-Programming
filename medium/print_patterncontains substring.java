##input
String s="badeaebcaae";
String pattern="aabc";
##output
badeaebc
adeaebc
deaebca
eaebca
aebca
ebcaa
bcaa



import java.util.*;
public class print_patterncontains{
    public static void main(String args[]){
        String s="badeaebcaae";
        String pattern="aabc";
        
         System.out.println(checksubstringpresent(s,pattern));
        
         
    }
    public static String checksubstringpresent(String s,String pattern){
        
        if(s.length()==0||pattern.length()==0||pattern.length()>s.length()){
            return "";
        }
        Map<Character,Integer>hm=new HashMap<Character,Integer>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            
            hm.put(c,hm.getOrDefault(c,0)+1);
            
        }
            int matchedElement=0;
            int start=0;
             
            int minsubstringlength=Integer.MAX_VALUE;
            int minsubstart=0;
            
            for(int end=0;end<s.length();end++){
                char ch=s.charAt(end);
                
                if(hm.containsKey(ch)){
                    hm.put(ch,hm.get(ch)-1);
                    if(hm.get(ch)>=0){
                        matchedElement++;
                    }
                }
            
            while(matchedElement==pattern.length()){
                System.out.println(s.substring(start,end+1));
                if(end-start+1<minsubstringlength){
                    minsubstringlength=end-start+1;
                    minsubstart=start;
                }
                char charAtstart=s.charAt(start++);
                if(hm.containsKey(charAtstart)){
                    if(hm.get(charAtstart)==0){
                        matchedElement--;
                    }
                    hm.put(charAtstart,hm.get(charAtstart)+1);
                }
            }
        }
        if(minsubstringlength>s.length()){
                return "";
            }
        return "";
    }
}

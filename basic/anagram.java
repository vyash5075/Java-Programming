##Input
s1=bat
s2=tab

##Output
String is anagram


import java.util.*;
public class anagram{
    public static void main(String args[]){
        String s1="bat";
        String s2="tab,";
        
        HashMap<Character,Integer>hm=new HashMap<>();
        
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                char c1=s1.charAt(i);
                char c2=s2.charAt(i);
                if(hm.containsKey(c1)){
                    hm.put(c1,hm.get(c1)+1);
                }
                else{
                    hm.put(c1,1);
                }
               if(hm.containsKey(c2)){
                    hm.put(c2,hm.get(c2)-1);
                }
                else{
                    hm.put(c2,-1);
                }
            }
            
            int c=hm.size();
            int fc=0;
            
            for(Map.Entry entry: hm.entrySet()){
                 int v=(int)entry.getValue();
               
                 if(v==0){
                     
                     fc++;
                 }
                
            }
            if(c==fc)
                System.out.println("String is anagram");
            else
            System.out.println("String is not anagram");
          
        }
        else{
            System.out.println("String is not  anagram");
        }
    }
}

##Input
deaabbcd
##output
e


import java.util.*;
public class firstuniqueElement{
    public static void main(String args[]){
        String s1="deaabbcd";
        char ch[]=s1.toCharArray();
        LinkedHashMap<Character,Integer>hm=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<ch.length;i++){
             if (hm.containsKey(ch[i]))
            {
                hm.put(ch[i], hm.get(ch[i]) + 1);
            }
            else
            {
                hm.put(ch[i], 1);
            }
              
        }
        
        for(Map.Entry entry:hm.entrySet()){
            if((int)entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
            
        }
        
    }
}

##Input
banana
##output

b,1
n,2
a,3

import java.util.*;
public class sortHashMap{
    public static void main(String args[]){
        String s1="banana";
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        HashMap<Character,Integer>h=sortByValue(hm);
        for(Map.Entry entry:h.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
    
    public static HashMap<Character,Integer> sortByValue(HashMap<Character,Integer>hm){
        List<Map.Entry<Character,Integer>>list=new LinkedList<Map.Entry<Character,Integer>>(hm.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
           public int compare(Map.Entry<Character,Integer>o1,Map.Entry<Character,Integer>o2){
               return (o1.getValue()).compareTo(o2.getValue());
           } 
        });
        
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}

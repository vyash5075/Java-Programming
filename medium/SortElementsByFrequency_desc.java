import java.util.*;
public class SortElementsByFrequency_desc{
    public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<Character, Integer> > list =
               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
         
        // put data from sorted list to hashmap
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
 
    public static void main(String args[]){
        String s1="banana";
       HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
       for(int i=0;i<s1.length();i++){
           char c=s1.charAt(i);
           if(hm.containsKey(c)){
               hm.put(c,hm.get(c)+1);
           }
           else{
               hm.put(c,1);
           }
       }
       
       Map<Character, Integer> hm1 = sortByValue(hm);
       
       for (Map.Entry<Character, Integer> en : hm1.entrySet()) {
            System.out.print(  en.getKey()  );
        }
       
    }
}

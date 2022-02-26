
import java.util.*;

public class Arraylisttoarray {
	public static void main(String[] args) {
 
	     List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
          Integer [] array = al.toArray(new Integer[al.size()]);
          
          for(Integer k:array){
              System.out.println(k);
          }
	}
}




import java.util.*;

public class Example2 {
	public static void main(String[] args) {
 
	     List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
          int [] array = new int[al.size()];
          
            for (int i = 0; i < al.size(); i++)
            array[i] = al.get(i);
  
        for (int x : array)
            System.out.print(x + " ");
	}
}




import java.util.*;

public class Example2 {
	public static void main(String[] args) {
 
	     List<String> al = new ArrayList<String>();
        al.add("10");
        al.add("20");
        al.add("30");
        al.add("40");
          String [] array = al.toArray(new String[al.size()]);
          
          for(String k:array){
              System.out.println(k);
          }
	}
}

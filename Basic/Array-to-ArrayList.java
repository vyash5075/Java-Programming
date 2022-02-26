
case 1: //when you have array of primitive datatype. in case of Integer array you have to do manually using for loop because you acnt do autoboxing
import java.util.*;
public class ArraytoArrayList{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int a:arr){
            al.add(a);
        }
        System.out.println(al);
       	  
    }
}


case2: // when you have array of Integer class 
import java.util.*;
public class ArraytoArrayList{
    public static void main(String args[]){
       Integer[] spam = new Integer[] { 1, 2, 3 };
List<Integer> list = Arrays.asList(spam);
        
        System.out.println(list);
       	  
    }
}


case 3:// when you hae string

import java.util.*;

public class Details {
	public static void main(String[] args) {
	  
	    String array[] = {"Text1","Text2","Text3","Text4"};   
   ArrayList<String> al= new ArrayList<String>(Arrays.asList(array));
	     System.out.println(al);
      }
}

case 4://using addall method

import java.util.*;

public class Example2 {
	public static void main(String[] args) {
 
	    String array[]={"Hi", "Hello", "Howdy", "Bye"};
	    ArrayList<String> arraylist= new ArrayList<String>();
	    Collections.addAll(arraylist, array);
	    
	    System.out.println(arraylist);
	}
}

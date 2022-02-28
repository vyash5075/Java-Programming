##Input
Hello I am yash Verma
##output
[amreV, hsay, ma, I, olleH]
import java.util.*;
public class reversewords{
    public static void main(String args[]){
        String s="Hello I am yash Verma";
        String st[]=s.split(" ");
       
        int i=0;
        int j=st.length-1;
        while(i<=j){
            
            String prev=reverse(st[i]);
            
            String next=reverse(st[j]);
            st[i]=next;
            st[j]=prev;
            i++;
            j--;
        }
        String f=Arrays.toString(st);
        
            System.out.println(f);
         
    }
    
    public static String reverse(String s){
        String rev="";
        for(int j=s.length()-1;j>=0;j--){
            rev+=s.charAt(j);
        }
        return rev;
    }
}

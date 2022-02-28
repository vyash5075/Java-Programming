##Input
s="Hi I am Yash"
##output
Yash am I Hi


import java.util.*;
public class reversewords{
    public static void main(String args[]){
        String s="Hello I am yash Verma";
        String st[]=s.split(" ");
        System.out.println(st.length);
        int i=0;
        int j=st.length-1;
        while(i<=j){
            String temp=st[i];
            st[i]=st[j];
            st[j]=temp;
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

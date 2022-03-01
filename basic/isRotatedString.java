##Input
s1=abcd
s2=dabc
##output
yes

import java.util.*;
public class isrotatedVersion{
    public static void main(String args[]){
        String s1="abcd";
        String s2="dabc";
        System.out.println(isRotatedversion(s1,s2));
    }
    public static boolean isRotatedversion(String s1,String s2){
        if(s1==null||s2==null){
            return false;
        }
        else if(s1.length()!=s2.length()){
            return false;
        }
        else{
            String temp=s1+s1;
            return (temp.contains(s2));
        }
    }
}

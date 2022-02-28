
import java.util.*;
public class compare{
    public static void main(String args[]){
        String s1="abcd";
        String s2="Abcd";
        boolean isCompare =false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                isCompare=true;
                break;
            }
        }
        if(isCompare){
            System.out.println("Both strings are not equal");
        }
        else{
             System.out.println("Both strings are equal");
        }
    }
}

##Input
Hi Ie em yashm Verema
##output
m

import java.util.*;
public class maximumfrequency{
    public static void main(String args[]){
        String s="Hi Ie em yashm Verema";
        s=s.replaceAll("\\s","");
        int arr[]=new int[256];
        char c=' ';
        int max=-1;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
 
        }
        
        for(int i=0;i<s.length();i++){
            if(max<arr[s.charAt(i)]){
                 max=arr[s.charAt(i)];
                c=s.charAt(i);
            }
        }
        System.out.println(c);
    }
}

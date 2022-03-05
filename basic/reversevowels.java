##Input
equation
##output
oqiatuen


import java.util.*;
public class reversevowels{
    public static void main(String args[]){
        String s="equation";
        int start=0;
        int end=s.length()-1;
        char arr[]=s.toCharArray();
        
        
        while(start<end){
            char frontc=arr[start];
            char lastc=arr[end];
            if(isvowel(frontc)==true && isvowel(lastc)==true){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
            
            if(!isvowel(frontc)){
                start++;
            }
            if(!isvowel(lastc)){
                end--;
            }
            
       
        }
             System.out.println(String.valueOf(arr));
    }
    
    public static boolean isvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        else{
            return false;
        }
        
    }
}

##Input
Hi I am Yash 
#output
Hi->2
I->1
am->2
yash->4

import java.util.*;
public class wordcount{
    public static void main(String args[]){
        String s1="Hi I am yash Verma";
        char ch[]=s1.toCharArray();
        int count=0;
        String s="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]!=' '){
                s=s+ch[i];
                count++;
            }
            else{
                System.out.println(s+"->"+count);
                s="";
                count=0;
            }
        }
         
            
        }
        
    
}

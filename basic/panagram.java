##Input
The Quick Brown fox jumps over the lazy dog
##output
true

//panagram is the string tha contains all the alphabets


import java.util.*;
public class panagram{
    public static void main(String args[]){
        String s="The Quick Brown fox jumps over the lazy dog";
        String d=s.toLowerCase();
        boolean ispanagram=true;
        for(int i=97;i<=122;i++){
            String c=(char)i+"";
            if(d.contains(c)){
               ispanagram=true; 
            }
            else{
                System.out.println(c);
                ispanagram=false;
                break;
            }
            
        }
        
        System.out.println(ispanagram);
    }
     
}

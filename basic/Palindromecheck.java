import java.util.*;
public class Palindromecheck{
    public static void main(String args[]){
        String s="aha";
         char arr[]=s.toCharArray();
        
         int i=0;
         int j=s.length()-1;
         while(i<=j){
             char temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
         }
         String rev=String.valueOf(arr);
         if(s.equals(rev)){
             System.out.println("String is palindromic");
         }
         else{
               System.out.println("String is not palindromic");
         }
       
        
    }
}

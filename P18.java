## Input
Enter the number of rows needed to print the pattern 
5
## output
*  *  *  *  *  
*        *  
*     *  
*  *  
*  

import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int rows=sc.nextInt();
         for(int i=0;i<rows;i++){
             for(int j=i;j<rows;j++){
                 if(i==0||j==i||j==rows-1){
                  System.out.print("*  ");   
                 }
                 else{
                     System.out.print("   ");
                 }
                  
             }
              
             
             
             System.out.println();
         }
          
          
    }
}

## Input
Enter the number of rows needed to print the pattern 
5
## output
* * * * * 
* * * * 
* * * 
* * 
* 

import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of Rows");
        int rows=sc.nextInt();
         for(int i=0;i<rows;i++){
             for(int j=0;j<rows-i;j++){
                 System.out.print("* ");
             }
             System.out.println();
         }
    }
}

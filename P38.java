 ## Input
Enter the number of rows needed to print the pattern 
5
## output

    *
   *
  *
 *
*
* * * * * * * * * * 
 *
  *
   *
    *
     *


import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int rows=sc.nextInt();
        for(int i=0;i<=2*rows;i++){
            if(i==rows){
                for(int j=-0;j<2*rows;j++){
                      System.out.print("* ");
                }
            }
            else{
                if(i<rows){
                    for(int j=0;j<rows-i-1;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                
                }
                else if(i>=rows){
                    for(int j=rows;j<i;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                }
            
            System.out.println();
        }
    }
}

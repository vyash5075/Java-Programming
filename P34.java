 ## Input
Enter the number of rows needed to print the pattern 
5
## output
 *** 
*   *
*   *
*   *
*   *
 *** 
*   *
*   *
*   *
 *** 

import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int rows=sc.nextInt();
        for(int i=0;i<=2*rows-1;i++){
            if(i==0||i==rows||i==2*rows-1){
                for (int j = 0; j < rows; j++)
                {
                    if (j ==0 || j == rows-1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            else{
                for(int k=0;k<rows;k++){
                    if(k==0||k==rows-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

 ## Input
Enter the number of rows needed to print the pattern 
5
## output

        * 
      *   * 
    *       * 
  *           * 
* * * * * * * * * 
  *           * 
    *       * 
      *   * 
        * 
   
   
   import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i-1;j++){
                System.out.print("  ");
            }
            for(int k=0;k<2*i+1;k++){
                if(k==0||i==rows-1||k==2*i){
                     System.out.print("* ");
                }
                else{
                     System.out.print("  ");
                }
               
            }
            System.out.println();
        }
         for(int i=1;i<rows;i++){
             for(int j=0;j<i;j++){
                 System.out.print("  ");
             }
             for(int k=i;k<2*rows-i-1;k++){
                 if(k==i||i==0||k==2*rows-i-2){
                      System.out.print("* ");
                 }
                else{
                     System.out.print("  ");
                }
             }
             System.out.println();
         }
    }
}

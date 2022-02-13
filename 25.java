## Input
Enter the number of rows needed to print the pattern 
5
## output
  * * * * * 
    *       * 
      *       * 
        *       * 
          * * * * * 
  
  import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int rows=sc.nextInt();
         
        int rowse=rows-1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("  ");
            }
            for(int k=0;k<rows;k++){
                if(i==0||i==rows-1||k==0||k==rows-1){
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

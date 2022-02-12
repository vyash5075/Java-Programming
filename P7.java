
   
## Input
Enter the number of rows needed to print the pattern 
5
## output
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 


  
  import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int rows=sc.nextInt();
        int rowssec=rows-1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i-1;j++){
                System.out.print("  ");
            }
            for(int k=0;k<(2*i)+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i=0;i<rowssec;i++){
            for(int j=0;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=0;k<(2*(rowssec-i))-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


   
 ## Input
Enter the number of rows needed to print the pattern 
11
## output
     *     
    ***    
   * * *   
  *  *  *  
 *   *   * 
***********
 *   *   * 
  *  *  *  
   * * *   
    ***    
     *     

   
   import java.util.Scanner;
public class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i, j;
int n = sc.nextInt();  // ‘n’ must be odd
int num1 = n / 2 * 3;
for(i = 0; i < n; i++)
{
for(j = 0; j < n; j++)
{
// center horizontal, center vertical, upper left diagonal, bottom left diagonal, upper right diagonal, bottom right diagonal
if(i == n / 2 || j == n / 2 || i + j == n / 2 || i - j == n / 2 || j - i == n / 2 || i + j == num1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}

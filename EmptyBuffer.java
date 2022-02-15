##input
yash verma
5
India delhi

##output
yash verma is 5 years old and he belongs to india delhi

import java.util.*;
public class basic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        sc.nextLine();
        String k=sc.nextLine();
        System.out.println( s +" is "+n+" years old "+"and he belongs to "+k);
    }
}

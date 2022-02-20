##Input
a=20
b=10
##output
a=10
b=20

import java.util.*;
public class swap{
    public static void main(String args[]){
        int a=20;
        int b=10;
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println(a+","+b);
    }
}

##Input
1234
2
##output
3421
import java.util.*;
public class rotate{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.");
    int no=sc.nextInt();
    System.out.println("Enter the no of rotation ");
    int rotations=sc.nextInt();
    int totaldigits=0;
    int dupno=no;
    while(dupno!=0){
        totaldigits++;
        dupno=dupno/10;
    }
    
    if(rotations<0){
        rotations=totaldigits+rotations;
    }
    rotations=rotations%totaldigits;
    int div=1;
    int mult=1;
    for(int i=0;i<totaldigits;i++){
        if(i<rotations){
         div=div*10;   
        }
        else{
            mult=mult*10;
        }
        
    }
    System.out.println(div+","+mult);
    int q=no/div;
    int  r=no%div;
    int rot=r*mult+q;
    System.out.println(rot);
}
}


##Input
[1,2,4,5,6]
##output
3

import java.util.*;
public class array{
    public static void main(String args[]){
        int ar[]={1,2,4,5,6};
        int expectedElements=ar.length+1;
        int totalsum= (expectedElements*(expectedElements+1))/2;
        System.out.println(totalsum);
        int arsum=0;
        for(int n:ar){
            arsum+=n;
        }
        System.out.println("Missing element is"+ (totalsum-arsum));
    }
}



//by bitwise operator

import java.util.*;
public class missing{
    public static void main(String args[]){
        int ar[]={1,2,3,4,6};
        int xor1=ar[0];
        for(int i=1;i<ar.length;i++){
            xor1=xor1^ar[i];
        }
        int xor2=1;
        for(int i=2;i<=ar.length+1;i++){
            
            xor2=xor2^i;
            
        }
        int result=xor1^xor2;
        System.out.println(result);
    }
}

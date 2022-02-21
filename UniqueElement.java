##Input
{5,3,4,5,2,3,4}
##output
2

import java.util.*;
public class array{
    public static void main(String args[]){
        int ar[]={5,3,4,5,2,3,4};
        int res=ar[0];
        for(int i=1;i<ar.length;i++){
            int k=res;
            res=res^ar[i];
            System.out.println(k+","+ar[i]+"="+res);
        }
        System.out.println(res);
    }}

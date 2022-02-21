import java.util.*;
public class maximumsumsubarray{
    public static void main(String args[]){
        int ar1[]={-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxsubarray(ar1));
    }
    public static int maxsubarray(int ar1[]){
        int max_so_far=Integer.MIN_VALUE;
        int max_ending=0;
        for(int i=0;i<ar1.length;i++){
            max_ending=max_ending+ar1[i];
            if(max_so_far<max_ending){
                max_so_far=max_ending;
            }
            if(max_ending<0){
                max_ending=0;
            }
        }
        return max_so_far;
    }
}

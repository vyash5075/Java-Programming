##Input
ar[]={4,3,7,9,2,4,7};
ar2[]={5,1,4,8,3,5,1,4,8,};

##output
3,4
import java.util.*;
public class array{
    public static void main(String args[]){
        int ar[]={4,3,7,9,2,4,7};
        int ar2[]={5,1,4,8,3,5,1,4,8,};
        HashSet<Integer>hm=new HashSet<Integer>();
        for(int i=0;i<ar.length;i++){
            hm.add(ar[i]);
        }
         HashSet<Integer>hm2=new HashSet<Integer>();
        for(int i=0;i<ar2.length;i++){
            hm2.add(ar2[i]);
        }
        
        for(Integer m:hm2){
            if(hm.contains(m)){
                 System.out.println(m);
            }
            else{
               
            }
        }
    }
}

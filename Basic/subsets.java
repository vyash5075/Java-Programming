##input
10,20,30,40

##output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	


import java.util.*;
public class subsets{
    public static void main(String args[]){
        int arr[]={10,20,30};
        int limit=(int)Math.pow(2,arr.length);
        for(int i=0;i<limit;i++){
            int temp=i;
            String set="";
            for(int j=arr.length-1;j>=0;j--){
                int r=temp%2;
                temp=temp/2;
                if(r==0){
                    set="-\t"+set;
                }
                else{
                    set=arr[j]+"\t"+set;
                }
            }
            System.out.println(set);
        }
    }
}

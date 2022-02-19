##input
{3,1,5,0,8,5};
##output

				*		
				*		
				*		
		*		*	*	
		*		*	*	
*		*		*	*	
*		*		*	*	
*	*	*		*	*	

import java.util.*;
public class Bargraph{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]={3,1,5,0,8,5};
    int max=Integer.MIN_VALUE;
    for(int l=0;l<arr.length;l++){
        if(arr[l]>max){
            max=arr[l];
    }
    }
    int m=max;
    
    for(int i=1;i<=max;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[j]<m){
                System.out.print("\t");
            }
            else{
                System.out.print("*\t");
            }
           
        }
         m--;
        System.out.println();
    }
    }

}

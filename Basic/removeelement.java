##input
{10,40,30,80,60,20}
30
##output
{10,40,80,60,20}

import java.util.*;
public class removeelement{
    public static void main(String args[]){
        int arr[]={10,40,30,80,60,20};
        int deleteelement=30;
        for(int i=0;i<arr.length;i++){
            if(deleteelement==arr[i]){
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
    }
}

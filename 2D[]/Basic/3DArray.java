import java.util.*;
public class JaggedArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][][]={{{5,10},{15,20,30,35},{34,46,57,68}}};
         
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+",");
                }
                System.out.print("/");
            }
            System.out.println();
        }
    }
}

*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	

  import java.util.*;
public class hollowdiamond{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int st=n/2 + 1;
        int sp=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
             for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                sp+=2;
                st--;
            }
            else{
                st++;
                sp-=2;
            }
            
            System.out.println();
        }
    }
}

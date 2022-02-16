1																		1	
1	2																2	1	
1	2	3														3	2	1	
1	2	3	4												4	3	2	1	
1	2	3	4	5										5	4	3	2	1	
1	2	3	4	5	6								6	5	4	3	2	1	
1	2	3	4	5	6	7						7	6	5	4	3	2	1	
1	2	3	4	5	6	7	8				8	7	6	5	4	3	2	1	
1	2	3	4	5	6	7	8	9		9	8	7	6	5	4	3	2	1	
1	2	3	4	5	6	7	8	9	10	9	8	7	6	5	4	3	2	1	

  import java.util.*;
public class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int totalcolumns=(2*n)-1;
        
        for(int i=1;i<=n;i++){
            int m=1;
            for(int j=1;j<=i;j++){
                System.out.print(j+"\t");
                m++;
            }
             
            for(int k=1;k<=totalcolumns-(2*i);k++){
                System.out.print("\t");
            }
              for(int j=1;j<=i;j++){
                  m--;
                  if(m==n){
                      
                  }
                  else{
                       System.out.print(m+"\t");
                  }
               
               
            }
            System.out.println();
        }
    }
}

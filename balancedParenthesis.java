import java.util.*;
public class balancedString{
    public static void main(String args[])
{
    String s="{(yash[verma]yes)ok}";
    Stack<Character>st=new Stack<Character>();
    
    int breakk=0;
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='{'||c=='('||c=='['){
            st.push(c);
        }
        else if(c=='}'||c==')'||c==']'){
            if(st.empty()){
                System.out.println("Not balanced");
                breakk=1;
                break;
            }
            else{
                int topElement=st.peek();
                if(c=='}'&&topElement=='{'){
                    st.pop();
                }
                else if(c==')'&&topElement=='('){
                    st.pop();
                }
                else if(c==']'&&topElement=='['){
                    st.pop();
                }
                else{
                    System.out.println("Not balanced");
                breakk=1;
                break; 
                }
            }
           
        }
    }
    if(st.size()==0&&breakk==0){
        System.out.println("Balanced");
    }
    
}}

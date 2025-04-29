import java.util.*;
import java.util.Stack;

// public class balanceTheBrackets {
//     public static boolean IsBalanced(String str){
//         Stack<Character> st = new Stack<Character>();
//         int len = str.length();
//         for(int i=0;i<len;i++){
//             char ch = str.charAt(i);
//             if(ch == '('){
//                 st.push(ch);
//             }else{
//                 if(st.size()==0)return false;
//                 if(st.peek() == '(' )st.pop();
//             }
//         }
//         if(st.size()>0)return false;
//         else return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         System.out.println(IsBalanced(str));

//     }
// }



public class balanceTheBrackets {
    public static int IsBalanced(String str){
        Stack<Character> st = new Stack<Character>();
        int len = str.length();
        int count=0;
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                if(st.isEmpty()){
                    count++;
                }else{
                    st.pop();
                }
                
            }
        }
        count+=st.size(); //remaining brackets in the stack
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(IsBalanced(str));

    }
}

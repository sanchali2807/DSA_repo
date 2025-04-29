import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;

public class Stacks_basic {
    public static void main(String[] args) {
        //ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

        //reverse order 
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            // int x = st.peek();
            rt.push(st.pop());
            //st.pop();
        }
        System.out.println(rt);
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
        System.out.println(st);


       // System.out.println(st.isEmpty());
        //push
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(5);
        // System.out.println(st.isEmpty());
        //peek
        // System.out.println(st.peek());//topmost element access
        // System.out.println(st);
        // st.pop();
        // System.out.println(st);
        // System.out.println(st.size() );
        // while(st.size()>1){// prints the very first element
        //     // but now the stack only has that one element
        //     st.pop();
        // }
        // System.out.println(st.peek());
        // System.out.println(st);

           
    }
}

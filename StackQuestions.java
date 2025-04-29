import java.util.*;
import java.util.Stack;
public class StackQuestions {

    public static void DisplayStack(Stack<Integer> s){
       // s.push(6);
       if(s.isEmpty())return;
       int top = s.pop();
       DisplayStack(s);
       System.out.print(top+" ");
       s.push(top);

    }
    public static void InsertAt(Stack<Integer> st , int idx , int val){
        if(st.size()==idx){
            st.push(val);
            return;}
        int top = st.pop();
        //System.out.println(top);
        InsertAt(st,idx,val);
        
        st.push(top);

    }
    // public static void DeleteAt(Stack<Integer> st , int idx ){
    //     if(st.size()==idx){
    //         st.pop();
    //         return;
    //     }
    //     int top = st.pop();
    //     System.out.println(top);
    //     DeleteAt(st,idx);
        
    //     st.push(top);

    // }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int idx = 1;
        //int value = 9;
        //System.out.println(st);
        //InsertAt(st, idx, value);
        // System.out.println(st);
        // DeleteAt(st, idx);

        /*
         /// DELETE FROM ANY INDEX 
        Stack<Integer> rt = new Stack<>();

        while(st.size()>idx+1){
            rt.push(st.pop());

        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
         */

        //System.out.println(st);
        /*
        /// USING ARRAYS
        int n = st.size();
        int [] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            int x = st.pop();
            arr[i] = x;
        }
        for(int i=0;i<n;i++){
            int x = arr[i];
            System.out.println(x);
            st.push(x);
        }
        System.out.println(st);
         */

        /*
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
           rt.push(st.pop()); 
        }
        while(rt.size()>0){
            int x = rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        */


        /*
        /// INSERT IN THE STACK
        int x = 7;
        int idx = 1 ;
        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
         */


        /// USING RECURSION
        //     System.out.println(st);
        //    DisplayStack(st);
        //    //System.out.println(st);

    }
}

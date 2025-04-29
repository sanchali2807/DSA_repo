// public class NextGreaterElement {
//     public static void main(String[] args) {
//         int [] arr ={1,3,2,1,8,6,2,4};
//         int [] res = new int[arr.length];
//         for(int i=0;i<res.length;i++){
//             res[i]=-1;
//             for(int j=i+1;j<res.length;j++){
//                 if(arr[j]>arr[i]){
//                     res[i]=arr[j];
//                     break;
//                 }
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//         for(int i=0;i<arr.length;i++){
//             System.out.print(res[i]+" ");
//         }

//     }
// }



///Using Stacks

import java.util.Stack;
public class NextGreaterElement{
    public static int[] NextGreater(int [] a){
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int [] res = new int [n];
       // res[n-1]=-1;
       // st.push(a[n-1]);
        for(int i=n-1 ; i>=0 ;i--){
            while(!st.isEmpty() && st.peek() <= a[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i]=-1;
            else{
                res[i]=st.peek();
            }
            st.push(a[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr ={1,3,2,1,8,6,2,4};
        int [] res = NextGreater(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(res[i]);
        }
    }
}

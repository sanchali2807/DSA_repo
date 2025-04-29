// public class SearchPrac {
//     static int ToFind(int [] arr , int target){
//         int n = arr.length;
//         int st = 0;
//         int end = n-1;
//         int fo=-1;
//         while(st<=end){
//             int mid = st+((end-st)/2);
//             if(target==arr[mid]){
//                 fo = mid;
//                 st = mid+1;// for last occurence of that word
//                 //end = mid-1; for first occurence
//             }else if(target<arr[mid]){
//                 end=mid-1;
//             }else{
//                 st = mid+1;
//             }
//         }
//         return fo;
//     }
//     public static void main(String [] args){
//         int [] arr = {2,5,5,5,6,6,8,9,9};
//         int target = 5;
//         System.out.println(ToFind(arr, target));

//     }
// }


public class SearchPrac{
    static int SquareRoot(int target){
        int ans =-1;
        int st = 0;
        int end = target-1;
        while(st<end){
            int mid = st+((end-st)/2);
            int value = mid*mid;
            if(value==target){
                ans =mid;
            }else if(value>target){
                end=mid-1;
            }else{
                st = mid=1;
                ans = mid;
            }
        }
        return mid;
    }

    public static void main(String [] args){
        int n = 24;
        
        dout


    }
}
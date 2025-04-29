// public class Binarysearch {
//     static boolean Binary_search(int []a,int target){
//         int n = a.length;
//         int st = 0;
//         int end = n-1;
//         while(st<=end){
//             int mid =(st+end)/2;
//             if(target==a[mid]){
//                 return true;
//             }else if(target<a[mid]){
//                 end=mid-1;
//             }else{
//                 st=mid+1;
//             }
//         }
//         return false;
//     }
//     public static void main(String [] args){
//         int [] arr = {1,2,3,4,5,6};
//         int target =0;
//         while(target!=10){

//             System.out.println(Binary_search(arr, target));
//             target++;
//         }

//     }
// }


public class Binarysearch{
    static boolean RecBinary(int []a , int st , int end ,int target){
        if(st>end)return false;
        int mid = st+((st-end)/2);
        if(target == a[mid]){
            return true;
        }else if(target< a[mid]){
            return RecBinary(a, st, mid-1, target);
        }else{
            return RecBinary(a, mid+1, end, target);
        }
        

    }
    public static void main(String[] args){
        int [] arr ={1,2,3,4,5,6,7};
        int target=6;
        System.out.println(RecBinary(arr, 0, arr.length-1, target));
    }
}
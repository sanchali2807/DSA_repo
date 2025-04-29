// public class rotatedsortarray {
//     static int findMin(int [] a){
//         int n = a.length;
//         int st =0;
//         int ans=-1;
//         int end = n-1;
//         while(st<=end){
//             int mid = st + ((end-st)/2);
//             if(a[mid]<=a[n-1]){
//                 ans = mid;
//                 end = mid -1;
//             }else{
//                 st=mid +1;

//             }
//         }
//         return ans;
//     }
//     public static void main(String [] args){
//         int [] arr = {5,6,7,1,2,3,4};
//         System.out.println(findMin(arr));
//     }
    
// }
  


public class rotatedsortarray{
    // static int FindTarget(int [] a , int target){
    //     int n = a.length;
    //     int st = 0;
    //     int end = n-1;
    //     int ans =-1;
    //     while(st<=end){
    //         int mid  = st + ((end-st)/2);
    //         if(a[mid]==target){
    //             return mid;
    //         }else if(a[mid]<a[end]){//mid to end is sorted
    //            if(target>a[mid] && target <=a[end]){
    //             st=mid+1;
    //            }else{
    //             end=mid-1;
    //            }
    //         }else { // start to mid is sorted
    //             if(target >=a[st] && target < a[mid]){
    //                 end= mid-1;
    //             }else{
    //                 st = mid+1;

    //             }
    //         }

    //     }
    //     return -1;
    // }
    static int Search_in_duplicates(int [] a , int target){
        int n = a.length;
        int st = 0;
        int end = n-1;
        int ans =-1;
        while(st<=end){
            int mid  = st + ((end-st)/2);
            if(a[mid]==target){
                return mid;
            }else if(a[st]==a[mid] && a[end]== a[mid] ){
                ++st;
                --end;
            }
            else if(a[mid]<=a[end]){//mid to end is sorted
                // we can equal to as we saw that even if they are equal pivot does not lie there
               if(target>a[mid] && target <=a[end]){
                st=mid+1;
               }else{
                end=mid-1;
               }
            }else { // start to mid is sorted
                if(target >=a[st] && target < a[mid]){
                    end= mid-1;
                }else{
                    st = mid+1;

                }
            }

        }
        return -1;
    }
    public static void main(String [] args){
        // int [] arr = {5,6,7,8,9,1,2,3,4};
        // int target = 3;
        // System.out.println(FindTarget(arr, target));
        int [] arr1 = {1,1,1,1,1,2,3,3,1};
        int value = 2;
        System.out.println(Search_in_duplicates(arr1, value));
    }
}



// public class rotatedsortarray{
//     public static void main(String [] args){

//     }
// }
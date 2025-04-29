// public class sortPractice {
//     static void ZeroesAtEnd(int [] a){
//         int n= a.length;
//         boolean flag =false;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
//                 if(a[j]==0 && a[j+1]!=0){
//                     int temp=a[j];
//                     a[j]=a[j+1];
//                     a[j+1]=temp;
//                     flag=true;
//                 }
//                 if(flag==false){
//                     return;
//                 }
//             }
//         }
//     }
//     public static void main(String []args){
//         int [] arr ={0,5,0,3,4,2};
//         ZeroesAtEnd(arr);
//         for(int val : arr){
//             System.out.println(val);
//         }
//     }
// }





// public class sortPractice{
//     static void SortFruits(String[] a){
//         int n = a.length;
//         for(int i=0;i<n-1;i++){
//             int min_index=i;
//             for(int j=i+1;j<n;j++){
//                 if(a[j].compareTo(a[min_index])<0){
//                     min_index=j;
//                 }
//                 String temp = a[i];
//                 a[i]=a[min_index];
//                 a[min_index]=temp;
//             }
//         }
//     }
//     public static void main(String [] args){
//          String [] fruits ={"kiwi","apple","orange","mango","pinapple","papaya"};
//          SortFruits(fruits);
//          for(String val : fruits){
//             System.out.println(val);
//          }
//     }
// }

// public class sortPractice{
//     public static void main(String [] args){
//         int [] arr ={30,210,100,40,70};
//         int largest = arr[0];
//         int seclarg = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>largest){
//                 seclarg=largest;
//                 largest=arr[i];
//             }else if(arr[i]>seclarg && arr[i]<largest){
//                 seclarg=arr[i];
//             }
//         }
//         System.out.println(largest);
//         System.out.println(seclarg);
//     }
// }

// public class sortPractice{
//     static void sortArr(int [] arr){
//         int n= arr.length;
//         int x=-1;
//         int y=-1;
//         // check if the size is only one which will not owr
//         // this is called handing edge cases
//         if(n<=1)return;
//         for(int i=1;i<n;i++){
//             if(arr[i-1]>arr[i]){
//                 //conflict
//                 if(x==-1){
//                     x=i-1;
//                     y=i;
//                 }else{
//                     y=i;
//                 }
//             }
//         }
//         //swap x and y in num
//         int temp = arr[x];
//         arr[x] = arr[y];
//         arr[y]=temp;
//     }
//     public static void main(String[] args){
//         int [] arr = {10,5,6,7,8,9,3};
//         sortArr(arr);
//         for( int i : arr){
//             System.out.println(i);
//         }
//     }
// }
// now complexity loop iterates n times so tc is O(n)



// public class sortPractice{
//     static void swap(int [] arr , int x ,int y){
//         int temp = arr[x];
//         arr[x] =arr[y];
//         arr[y] = temp;
//     }
//     static void partitionIt(int [] arr ){// only num will be passed as the start and end point is fixed and pivot index is also fixed
//         int l=0;
//         int r = arr.length -1;
//         while(l<r){
//             while(arr[l]<0)l++;
//             while(arr[r]>=0)r--;
//             if(l<r){
//                 swap(arr,l,r);
//                 l++;
//                 r--;
//             }
//         }
        
//     }
   
//     public static void main(String [] args){
//       int [] arr = {19,-20,7,-4,-13,11,-5,3};
//         partitionIt(arr);
//         for(int val : arr){
//             System.out.println(val);
//         }
//     }
// }


public class sortPractice{
    public static void main(String [] args){
        
    }
}
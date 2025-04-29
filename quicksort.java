public class quicksort {
    static void displayArray(int[] arr){
        for(int i:arr){
            System.out.println(i);
        }
    }
    static void swap(int []arr , int x ,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int [] arr,int st ,int end){
        int pivot = arr[st];
        int count=0;
        for(int i=st+1 ; i<=end;i++){
            if(arr[i]<=pivot)count++;
        }
            int pivot_index = st+count;
            swap(arr , st , pivot_index);
            int i=st , j=end;
            //elements lesser left and greater on the right of the pivot including duplicates of the pivot
            while(i<pivot_index && j>pivot_index){
                while(arr[i]<=pivot)i++;
                while(arr[j]>=pivot)j--;

                if(i<pivot_index && j>pivot_index){
                    swap(arr,i,j);
                    i++;
                    j--;
                }
            }
            return pivot_index;

        }
    
    static void quick_sort(int []arr, int start , int end){
        if(start>end) return;
        int pi = partition(arr,start,end);
        quick_sort(arr, start, pi-1);
        quick_sort(arr, pi+1, end);
    }
    public static void main(String [] args){
        int [] arr = {6,3,1,4,2,10};
        int n= arr.length;
        displayArray(arr);
        quick_sort(arr, 0, n-1);
        System.out.println("after quick sort");
        displayArray(arr);
    } 
    
}

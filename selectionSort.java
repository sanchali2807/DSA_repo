
public class selectionSort {
    
    static void SelecttionSort(int[] n){
        int a = n.length;
        for(int i=0;i<a-1;i++){//i is the current index
            int min_index=i;
//find the minimum element int he unsorted array
// unsorted part is i se leke a-1 tk
             for(int j=i+1;j<a;j++){
                if(n[j]<n[min_index]){
                    min_index=j;
                } 
             }
             //swap current element and minimum element
             //can also apply this condition
             //if(min_index)!=i means if i and min index is same 
             //no need to swap
             int temp = n[i];
             n[i]=n[min_index];
             n[min_index]=temp;
        }
    }

    public static void main(String[]args){
        int [] arr = {7,6,1,3,5,2};
        SelecttionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

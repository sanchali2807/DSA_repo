public class mergeSort {
    static void displayArray(int [] arr){
        for(int i=0 ;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void merge(int [] arr ,int l , int mid ,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int [] left =new int[n1];
        int [] right = new int [n2];
        int i,j,k;
        for(i=0;i<n1;i++) left[i]=arr[l+i];//l se shuru hoga
        for(j=0;j<n2;j++) right[j]=arr[mid+1+j];//mid+1 se shuru hoga
        i=0;
        j=0;
        k=l;
        while(i<n1&&j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                k++;
                i++;
            }else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    static void merge_sort(int []arr,int l, int r){
        //base case
        if(l>=r) return;
        int mid =(l+r)/2;
        merge_sort(arr, l, mid);//sort first half
        merge_sort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }
    public static void main(String [] args){
        int [] arr = {4,1,3,5,6,9,7,2};
        int n = arr.length;
        merge_sort(arr,0,n-1);
        System.out.println("array after sorting");
        displayArray(arr);
    }
}

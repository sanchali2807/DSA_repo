public class InsertionSort {
    static void Insertion_sort(int [] a){
        int n = a.length;
        for (int i=1;i<n;i++){
            int j=i;
            while( j>0 && a[j]<a[j-1] ){
                int temp = a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }

        }

    }
    public static void main(String [] args){
        int []arr={8,3,6,2,5,4};
        Insertion_sort(arr);
        for(int a:arr){
            System.out.println(a+" ");
        }

    }
}


// if i have to return the index of an array in the function in java write return new int[]{i, j};
// and then at end write return new int[]{-1,-1}; 
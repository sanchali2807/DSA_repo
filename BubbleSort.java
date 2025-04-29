//import java.util.Scanner;

public class BubbleSort {
    static void Bubble_Sort(int [] a){
        boolean flag =false;// no swapping done
        int n = a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true;
                }
            } 
            if(flag==false){//has any swaps happened 
                return;
            }
        }
    }
    static public void main(String [] args){
        int []a={11,5,1,3,4,9};
        Bubble_Sort(a);
        for(int i:a){
            System.out.println(i+" ");
        }
    }
}

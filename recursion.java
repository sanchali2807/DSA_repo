import java.util.Scanner;
import java.lang.*;

///print 1 to n
// public class recursion {
//     static void PrintNum(int n){
//     if(n==1){ // base case
//         System.out.println("1");
//         return;
//     }
//     PrintNum(n-1);
//     System.out.println(n);
//      }
    
//      public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         PrintNum(n);
//      }
// }

// print n to 1
// public class recursion{
//     static void PrintDec(int n){
//     if(n==1){
//         System.out.println("1");
//         return;
//     }
//     System.out.println(n);
//     PrintDec(n-1);
//     } 
//     public static void main(String [] args){
// Scanner sc = new Scanner(System.in);
// int n= sc.nextInt();
// PrintDec(n);
//     }
// }




// public class recursion{
//     static int factorial(int n){
//         if(n==0){
//             return 1; 
//         }

//     return n * factorial(n-1);
//     }
// public static void main(String [] args){
//     Scanner sc = new Scanner (System.in);
//     int n= sc.nextInt();
//     System.out.println(factorial(n));
// }
// }

// public class recursion{
//     static int fib(int n){
//          if(n==0 || n==1){
//             return n;
//          }
         
//          return fib(n-1)+fib(n-2);
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner (System.in);
//         int n= sc.nextInt();
//         for(int i=0;i<=n;i++){

//             System.out.println(fib(i));
//         }
//     }
// }


// public class recursion{
//     static int Sum(int num){
//         if(num>=0&&num<=9){
//             return num;
//     }
//         return Sum(num/10)+num%10;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.println(Sum(num));
//     }
// }


// public class recursion{
//     static int Count(int num){
//         if(num>=0&&num<=9){
//             return 1;
//         }
        
//         return 1+Count(num/10);// the number of time count is called it will keep adding 1
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.println(Count(num));

//     }
// }


// public class recursion{
//     static int Pow(int p,int q){
//         if (q==0) {
//             return 1;
//         }
//         return Pow(p,q-1)*p;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int p= sc.nextInt();
//         int q = sc.nextInt();
//         System.out.println(Pow(p,q));
//     }
// }

// public class recursion{
//     static void Multiple(int n ,int k){
//         if(k==0){
            
//             return;
//         }
//         Multiple(n,k-1);
//         System.out.println(n*k);

//     }
//     public static void main (String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int k=sc.nextInt();
//         Multiple(n, k);
//     }
// }

// public class recursion{
//     static int Sum(int n){
//         if(n==0) return 0;
//         if(n%2==0){
//             return Sum(n-1) -n;
//         }
//         else{
//             return Sum(n-1)+n;
//         }
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//         System.out.println(Sum(n));
//     }
// }


// public class recursion{
//     static int Gcd(int x,int y){
//          if(y==0){
//             return x;
//          }
//          return Gcd(y,x%y);
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         System.out.println(Gcd(x,y));
//     }

// }


// public class recursion{
//     static void Printarray(int[] arr , int ind){
//         if(ind==arr.length){
//             return ;
//         }
//          System.out.println(arr[ind]);
//          Printarray(arr, ind+1);

//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr1 = new int[n];
//         for(int i=0;i<n;i++){
//              arr1[i] = sc.nextInt();
//         }
//         Printarray(arr1, 0);
//     }
// }


// public class recursion{
//     static int MaxArray(int[] arr,int idx){
//         if(idx==arr.length-1){
//             return arr[idx];
//         }
//         int smallAns = MaxArray(arr,idx+1);
//         return Math.max(arr[idx],smallAns);
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int [] arr1 = new int[n];
//         for(int i=0;i<n;i++){
//              arr1[i] = sc.nextInt();
//         }
//         System.out.println( MaxArray(arr1,0));
//     }
// }


public class recursion{
    static int SumArray(int[] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        return SumArray(arr, idx+1) + arr[idx];
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        for(int i=0;i<n;i++){
             arr1[i] = sc.nextInt();
        }
        System.out.println(SumArray(arr1, 0));
    }
}
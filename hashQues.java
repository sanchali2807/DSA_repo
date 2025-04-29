import java.util.*;

// public class hashQues {
//     public static void main(String[] args) {
//         int [] arr = {1,4,2,5,5,1,4,4,6,4,4,4,1};
//         Map<Integer , Integer> freq = new HashMap<>();
//         for(int e : arr){
//             if(!freq.containsKey(e)){
//                 freq.put(e, 1);
//             }else{
//                 freq.put(e,freq.get(e)+1);
//             }
//         } 
//         System.out.println(freq.entrySet());
//         int maxfreq = 0;
//         int ansKey = -1;
//         for(var e : freq.entrySet() ){
//             if(e.getValue()>maxfreq){
//                 maxfreq = e.getValue();
//                 ansKey = e.getKey();
//             }
//         }
//         for(var key : freq.keySet()){
//             if(freq.get(key) > maxfreq){
//                 maxfreq = freq.get(key);
//                 ansKey = key ; 
//             }
//         }
//         System.out.println(ansKey);
//     }
// }






public class hashQues{
    static class MyHashMap<K,V>{
        public static final int DEFAULT_CAPACITY=4;
        public static final float DEFAULT_LOAD_FACTOR=0.75f;

        private class Node{
            // K is a type
            K key;
            V value;
            Node (K key , V value){
                this.key = key;
                this.value = value;
            }
    }
    private LinkedList<Node>[] buckets;
    public void initBuckets(int N){
        // N is the capacity and size of array
        buckets = new LinkedList[N];
        for(int i=0;i<buckets.length;i++){
             buckets[i] = new LinkedList<>();
        }
    }
    private int HashFun(K key){
        int hc = key.hashCode();
        
    }
    public MyHashMap(){
        initBuckets();
    }
        public int size(){
            //return no of enteries
        }
        public void put(K key ,V value){
            //insert and update
            int bi = HashFun();
        }
        public V get(K key){
            //return value so its return type is
        }
        public V remove(K key){

        }

    }
    public static void main(String[] args) {
        MyHashMap<String , Integer> mp = new MyHashMap<>();

    }
}
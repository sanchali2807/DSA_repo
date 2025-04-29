import java.util.*;

public class hashmap {
    static void hashmapMethod(){
        Map<String,Integer> mp = new HashMap<>();
        mp.put("Akash" , 21);//inserting values
        mp.put("Yash" , 16);
        mp.put("rakesh" , 23);
        mp.put("ash" , 22);
        //printing any particular value using get
        // if not present null
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));
        //update
        mp.put("Yash",25);
        System.out.println(mp.get("Yash"));
        //remove
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("riya"));

        //check if a key exist
        System.out.println(mp.containsKey("Akash"));
        //Adding a entry only if the new key value pair does not exist
        mp.putIfAbsent("Meena ", 30);
        //get all keys
        System.out.println(mp.keySet());
        //print all the values
        System.out.println(mp.values());
        //print values and the keys
        System.out.println(mp.entrySet());

        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d",key,mp.get(key));
            System.out.println();
        }
        System.out.println();
        for( Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d",e.getKey() , e.getValue());
            System.out.println();
        }
        System.out.println();
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d",e.getKey() , e.getValue());
            System.out.println();
        }
        

    }
    public static void main(String[] args) {
        hashmapMethod();
    }
}

package HashMap;
import java.util.*;

public class HashMapMethods {

    static void methodsHashMap(){
        HashMap<String, Integer> map = new HashMap<>();
        //Adding entries
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);
        map.put("Harry", 18);
        //Getting a value of a key from the hashmap
        System.out.println(map.get("Yash")); //will return 16
        System.out.println(map.get("Rahul")); //will return null as the key "Rahul" is not present in the map
        //Changing a value of a key in the hashmap
        map.put("Akash", 25); //will update the value of the key "Akash" from 16 to 25
        System.out.println(map.get("Akash"));
        //Removing an entry from the hashmap
        System.out.println(map.remove("Akash")); //will return 25 as the key "Akash" is present in the map
        System.out.println(map.remove("Akshita")); //will return false as the key "Akshita" is not present in the map
        //Checking if a map contains a particular key or not
        System.out.println(map.containsKey("Lav")); //will return true
        System.out.println(map.containsKey("Akash")); //will return false
        //Adding a new entry iff the key doesn't exist in the map already
        if(!map.containsKey("Yashika")) map.put("Yahika", 30);
        map.putIfAbsent("Liz", 15);
        //Getting all the keys from the hashmap
        System.out.println(map.keySet());
        //Getting all the values from the hashmap
        System.out.println(map.values());
        //Getting all the values from the hashmap
        System.out.println(map.entrySet());
        //Traversing all the entries from the hashmap
        for (String key : map.keySet()){
            System.out.printf("Age of %s is %d\n", key, map.get(key));
        }
        System.out.println();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.printf("Age of %s is %d\n", entry.getKey(), entry.getValue());
        }
        System.out.println();
        for (var entry : map.entrySet()) {
            System.out.printf("Age of %s is %d\n", entry.getKey(), entry.getValue());
        }
    }
    public static void main(String[] args) {
        methodsHashMap();
    }
}
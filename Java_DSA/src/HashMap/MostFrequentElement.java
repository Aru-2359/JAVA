package HashMap;
import java.util.*;

class MostFrequentElement{
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,4,1,5,7,4,2,3,5,3,4,2,7,5,6,4,5,6,2,5};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }else{
                map.put(ele, map.get(ele) + 1);
            }
        }
        System.out.println("Frequency Map:");
        System.out.println(map.entrySet());
        int maxFreq = 0;
        int ansKey = -1;
        for (int key : map.keySet()) {
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
                ansKey = key;
            }
        }
        // for (var entry : map.entrySet()) {
        //     if(entry.getValue() > maxFreq){
        //         maxFreq = entry.getValue();
        //         ansKey = entry.getKey();
        //     }
        // }
        System.out.printf("%d has the maximum frequency and it ocuurs %d times.", ansKey, maxFreq);
    }
}
package HashMap;
import java.util.*;

public class LargestSubarrayWith0Sum {

    static int largestSubArr(int[] arr){
        int maxLength = 0;
        int prefSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            if(map.containsKey(prefSum)){
                int currLen = i - map.get(prefSum);
                if(currLen > maxLength){
                    maxLength = currLen;
                }
            }else{
                map.put(prefSum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        int ans = largestSubArr(arr);
        System.out.println("The length of the largest subarray with 0 sum is: " + ans);
        int[] arr2 = {15, -2, 2, -8, 1, 7, 10, -25};
        int ans2 = largestSubArr(arr2);
        System.out.println("The length of the largest subarray with 0 sum is: " + ans2);
    }
}

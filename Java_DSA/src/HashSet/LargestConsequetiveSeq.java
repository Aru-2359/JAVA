package HashSet;
import java.util.*;

public class LargestConsequetiveSeq {

    static int largestConsequetive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        int maxLen = 0;
        for (Integer num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if(!set.contains(num - 1)){ //starting point of a sequence
                int currNum = num;
                int currLen = 1;
                while(set.contains(currNum + 1)){ //while the next number exists in the set
                    currLen++;
                    currNum++; //to get the next number
                }
                maxLen = Math.max(currLen, maxLen);
            }
        }
        return maxLen;
    } 

    public static void main(String[] args) {
        int[] arr = {100,1,200,3,2,4,0};
        System.out.println("The length of the longest consequetive sequence is: " + largestConsequetive(arr));
    }
}

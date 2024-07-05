package HashMap;
import java.util.*;

public class ValidAnagrams {

    static HashMap<Character, Integer> makeFreqMap(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else{
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            }
        }
        return map;
    }

    static boolean areValidAnagrams(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map1 = makeFreqMap(s1);
        HashMap<Character, Integer> map2 = makeFreqMap(s2);
        return map1.equals(map2);
    }

    static boolean areValidAnagrams2(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map = makeFreqMap(s1);
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }else{
                int freq = map.get(ch);
                map.put(ch, freq - 1);
            }
        }
        for (int i : map.values()) {
            if(i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = sc.next();
        System.out.print("Enter the second string: ");
        String s2 = sc.next();
        System.out.println("Using two maps: ");
        if(areValidAnagrams(s1, s2)){
            System.out.println(s1 + " and " + s2 + " are valid anagrams!");
        }else{
            System.out.println(s1 + " and " + s2 + " are not valid anagrams!");
        }
        System.out.println("Using one map: ");
        if(areValidAnagrams2(s1, s2)){
            System.out.println(s1 + " and " + s2 + " are valid anagrams!");
        }else{
            System.out.println(s1 + " and " + s2 + " are not valid anagrams!");
        }
        sc.close();
    }
}
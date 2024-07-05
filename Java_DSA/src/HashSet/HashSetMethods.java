package HashSet;
import java.util.*;

public class HashSetMethods {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("James");
        set.add("Mark");
        set.add("Scott");
        set.add("Mark"); //won't add as already exists
        System.out.println(set); //[James, Mark, Scott]
        System.out.println(set.contains("Mark")); //true
        set.remove("Mark");
        System.out.println(set.contains("Mark")); //false
        System.out.println(set.size()); //2
        set.add("Harry");
        for (String s : set) {
            System.out.println(s);
        }
    }
}

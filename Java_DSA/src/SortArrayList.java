import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(8);
        l1.add(14);
        l1.add(24);
        l1.add(4);
        l1.add(16);
        System.out.println("The original list is: "+l1);
        Collections.sort(l1);
        System.out.println("Ascending order: "+l1);
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Descending order: "+l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("It");
        l2.add("is");
        l2.add("my");
        l2.add("first");
        l2.add("time");
        l2.add("using");
        l2.add("'Collections'");
        System.out.println("The original list is: "+l2);
        Collections.sort(l2);
        System.out.println("Ascending order: "+l2);
        Collections.sort(l2, Collections.reverseOrder());
        System.out.println("Descending order: "+l2);
    }
}

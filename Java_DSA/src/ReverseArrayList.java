import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size()-1;
        while(i < j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(8);
        l.add(14);
        l.add(24);
        l.add(4);
        l.add(16);
        System.out.println("The original list is: "+l);
        //reverseList(l); Method 1
        Collections.reverse(l); //Method 2
        System.out.println("The reversed list is: "+l);
    }
}

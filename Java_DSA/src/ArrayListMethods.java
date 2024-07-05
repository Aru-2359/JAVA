import java.util.ArrayList;
class ArrayListMethods{
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        //add new element
        l1. add(2);
        l1.add(7);
        l1.add(1);
        l1.add(9);
        l1.add(4);
        //get element at index i
        System.out.println(l1.get(1));
        //print with for loop
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
        //print arraylist directly
        System.out.println(l1);
        //adding an element at index i
        l1.add(2, 13);
        System.out.println(l1);
        //modifying element at index i
        l1.set(2, 21);
        System.out.println(l1);
        //removing an element at index i
        l1.remove(2);
        System.out.println(l1);
        //removing an element e
        l1.remove(Integer.valueOf(9));
        System.out.println(l1);
        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(4));
        System.out.println(ans);
        /*if we don't specify a class, we can put anything inside the arraylist
        ArrayList l = new ArrayList();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);*/
    }
}
import java.util.ArrayList;

public class ReturnAllIndicesAsArrayList{
    static ArrayList<Integer> returnAllIndices(int[] arr, int target, int idx){
        ArrayList <Integer> ans = new ArrayList<>();
        if(idx == arr.length){
            return ans;
        } 
        if(arr[idx] == target){
            ans.add(idx);
        }
        ArrayList <Integer> smallAns = returnAllIndices(arr, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 8, 2, 2, 6, 2, 9, 2};
        ArrayList<Integer> al = returnAllIndices(arr, 2, 0);
        for(Integer i : al){
            System.out.print(i + " ");
        }
    }
}

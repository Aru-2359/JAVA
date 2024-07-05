public class ReturnLastIndex {
    static int returnLast(int[] arr, int idx, int target){
        if(idx == arr.length) return -1;
        int lastIndex = returnLast(arr, idx + 1, target);
        if(arr[idx] == target && idx > lastIndex){
            return idx;
        }
        else{
            return lastIndex;
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 6, 8, 2, 6, 2, 2, 3, 4, 2, 5};
        int ans = returnLast(arr, 0, 2);
        System.out.println("The last index of the target is " + ans);
    }
}


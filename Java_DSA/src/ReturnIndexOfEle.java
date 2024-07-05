public class ReturnIndexOfEle {
    static int returnIndex(int[] arr, int idx, int target){
        if(idx == arr.length) return -1;
        if(arr[idx] == target) return idx;
        return returnIndex(arr, idx + 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 54, 14, 3, 8, 6, 1};
        int ans = returnIndex(arr, 0, 8);
        System.out.println("The target is present at index " + ans);
    }
}


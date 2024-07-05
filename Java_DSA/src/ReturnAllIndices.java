public class ReturnAllIndices {
    static void returnIndices(int[] arr, int idx, int target){
        if(idx == arr.length) return;
        if(arr[idx] == target){
            System.out.print(idx + " ");
        }
        returnIndices(arr, idx + 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 5, 2, 2, 6, 9, 2};
        returnIndices(arr, 0, 2);
    }
}



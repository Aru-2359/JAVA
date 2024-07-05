public class MaxInArrRecur {
    static int maxEle(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int smallAns = maxEle(arr, idx + 1);
        return Math.max(arr[idx], smallAns);
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 3, 7};
        int max = maxEle(arr, 0);
        System.out.println("The maximum element in the array is: " + max);
    }
}

public class SubsetSum {
    static void printSubsetSum(int[] arr, int n, int idx, int currSum){
        if(idx >= n){
            System.out.println(currSum);
            return;
        }
        printSubsetSum(arr, n, idx + 1, currSum + arr[idx]);
        printSubsetSum(arr, n, idx + 1, currSum);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        System.out.println("The sums of all the subsets are: ");
        printSubsetSum(arr, arr.length, 0, 0);
    }
}

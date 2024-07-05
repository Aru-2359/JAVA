public class IsSortedRecur {
    static boolean isSorted(int[] arr, int idx){
        if(idx == arr.length - 1){
            return false;
        }
        if(arr[idx] <= arr[idx + 1]){
            return false;
        }
        return(isSorted(arr, idx + 1));
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 6, 9, 1, 8};
        if(isSorted(arr, 0)){
            System.out.println("The array is sorted!");
        }
        else{
            System.out.println("The array is not sorted!");
        }
    }
}


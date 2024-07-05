public class TargetExistsOrNot {
    static boolean eleExists(int[] arr, int idx, int target){
        if(idx == arr.length) return false;
        if(arr[idx] == target) return true;
        return eleExists(arr, idx + 1, target);
    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 54, 14, 3, 8, 6, 1};
        if(eleExists(arr, 0, 14)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

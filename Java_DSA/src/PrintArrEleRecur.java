public class PrintArrEleRecur {
    static void printEle(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.print(arr[idx] + " ");
        printEle(arr, idx + 1);
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 7, 4, 1};
        System.out.println("The elements of the array are: ");
        printEle(arr, 0);
    }
}

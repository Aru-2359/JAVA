public class InsertionSort {
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j --;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {45, 23, 69, 74, 93};
        System.out.println("The original array is: ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        sort(arr);
        System.out.println("\nThe sorted array is: ");
        for(int b : arr){
            System.out.print(b + " ");
        }
    }
}
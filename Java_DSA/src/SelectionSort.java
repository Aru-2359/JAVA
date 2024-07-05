public class SelectionSort {
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int min_idx = i;
            for(int j = i + 1; j < n ; j++){
                if(arr[j] < arr[ min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
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



public class ModifiedBubbleSort {
    static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            boolean flag = false;
            for(int j = 0; j < n - i - 1 ; j++){
                if(arr[j] > arr[ j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
                if(!flag){
                    return;
                }
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


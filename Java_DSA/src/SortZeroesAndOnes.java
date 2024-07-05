import java.util.Scanner;

public class SortZeroesAndOnes {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
/*    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int zeroes = 1;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(i < zeroes){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
    } */
    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if (arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right --;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
            System.out.println();
        }
        System.out.println("Array before sorting:");
        printArray(arr);
        System.out.println();
        sortZeroesAndOnes(arr);
        System.out.println("Array after sorting:");
        printArray(arr);
        sc.close();
    }
}

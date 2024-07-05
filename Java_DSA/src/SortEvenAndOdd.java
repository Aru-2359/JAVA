import java.util.Scanner;

public class SortEvenAndOdd {
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
    static void sortEvenAndOdd(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if (arr[left]%2 == 1 && arr[right]%2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]%2 == 0){
                left++;
            }
            if (arr[right]%2 == 1){
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
        System.out.println("Array before sorting even and odd:");
        printArray(arr);
        System.out.println();
        sortEvenAndOdd(arr);
        System.out.println("Array after sorting even and odd:");
        printArray(arr);
        sc.close();
    }
}
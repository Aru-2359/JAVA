import java.util.Scanner;

public class RotateArrayWithoutUsingNewArray {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<n ; i++) {
            System.out.println("Enter element "+i+" : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number of steps: ");
        int k = sc.nextInt();
        System.out.println("The array before rotation is:");
        printArray(arr);
        rotateInPlace(arr,k);
        System.out.println("\nThe array after rotation by " +k+ " steps is:");
        printArray(arr);
        sc.close();
    }
}

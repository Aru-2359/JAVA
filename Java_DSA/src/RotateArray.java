import java.util.Scanner;

public class RotateArray {
    static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for(int i = n-k; i<n; i++){
            // n-k to n-1
            ans[j++] = arr[i];
        }
        for(int i = 0; i<n-k; i++){
            // 0 to n-k-1
            ans[j++] = arr[i];
        }
        return ans;
    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
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
        int[] ans = rotateArray(arr,k);
        System.out.println("\nThe array after rotation by " +k+ " steps is:");
        printArray(ans);
        sc.close();
    }
}
import java.util.Scanner;

public class PrefixSumUsingNewArray {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
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
        System.out.println("Input Array:");
        printArray(arr);
        System.out.println();
        int[] pref = prefixSum(arr);
        System.out.println("Prefix Sum Array:");
        printArray(pref);
        sc.close();
    }
}

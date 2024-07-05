import java.util.Scanner;

public class EqualPrefixAndSuffixSum {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int findArraySum(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffSum = totalSum - prefSum;
            if(suffSum == prefSum){
                return true;
            }
        }
        return false;
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
        boolean ans = equalSumPartition(arr);
        System.out.println("Answer: " + ans);
        sc.close();
    }
}

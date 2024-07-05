import java.util.Scanner;

public class MaxDiff {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int maxDifference(int[] arr){
        int n = arr.length;
        int maxdiff = arr[1] - arr[0];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[j] - arr[i] > maxdiff){
                    maxdiff = arr[j] - arr[i];
                }
            }
        }
        return maxdiff;
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
        System.out.println("The maximum difference is: " + maxDifference(arr));;
        sc.close();
    }
}

import java.util.Scanner;

public class RangeQuery {
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the elements of the array:");
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element "+(i)+" : ");
            arr[i]=sc.nextInt();
            System.out.println();
        }
        System.out.println();
        int[] pref = prefixSum(arr);
        System.out.println("Enter the number of queries:");
        int q = sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter range: ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r] - pref[l-1];
            System.out.println("Sum of values within the range is: " + ans);
        }
        sc.close();
    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class PairSum {
    static int pairSum(int[] arr, int x){
        int ans=0;
        int n=arr.length;
        for(int i=0; i<n-1;i++){
            for(int j=i+1; j<n; j++){
                if((arr[i]+arr[j]==x)){
                    ans++;
                }
            }
        }
        return ans;
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
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int answer = pairSum(arr,target);
        System.out.println("The number of pairs is: "+answer);
        sc.close();
    }
}
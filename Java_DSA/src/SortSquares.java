import java.util.Scanner;

public class SortSquares {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArr(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int k = 0;
        int[] ans = new int[n];
        while(left <= right) {
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;
            }
            else{
                ans[k++] = arr[right] * arr[right];
                right--;
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
        System.out.println("The original array is:");
        printArray(arr);
        int[] ans = sortSquares(arr);
        reverseArr(ans);
        System.out.println("\nThe array after sorting squares in non-decreasing order is: ");
        printArray(ans);
        sc.close();
    }
}

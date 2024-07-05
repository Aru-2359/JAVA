/*import java.util.Scanner;

public class LeadersInArray {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printLeaders(int[] arr){
        int n = arr.length;
        int maxRight = arr[n - 1];
        System.out.println("The leaders in the array are: ");
        System.out.print(arr[n - 1]+ " ");
        for (int i = n - 2; i >= 0; i--) {
            if(arr[i] > maxRight){
                maxRight = arr[i];
                System.out.print(arr[i]+ " ");
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
        System.out.println("Input Array:");
        printArray(arr);
        System.out.println();
        printLeaders(arr);
        sc.close();
    }
}*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInArray {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void printLeaders(int[] arr){
        int n = arr.length;
        int maxRight = arr[n - 1];
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(maxRight);
        for (int i = n - 2; i >= 0; i--) {
            if(arr[i] > maxRight){
                leaders.add(arr[i]);
                maxRight = arr[i];
            }
        }
        System.out.println("The leaders in the array are: ");
        Collections.reverse(leaders);
        for(int leader : leaders) {
            System.out.print(leader + " ");
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
        System.out.println("Input Array:");
        printArray(arr);
        System.out.println();
        printLeaders(arr);
        sc.close();
    }
}
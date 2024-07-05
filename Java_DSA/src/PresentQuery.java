import java.util.Scanner;

public class PresentQuery {
    static int[] makeFreqArr(int[] arr){
        int[] freq = new int[100005]; //extra spaces for safety
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
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
        int[] freq = makeFreqArr(arr);
        System.out.println("Enter the number of queries: ");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter the element you want to search: ");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println(x+" is present in the array");
            }
            else{
                System.out.println(x+" is not present in the array");
            }
            q--;
        }
        sc.close();
    }
}

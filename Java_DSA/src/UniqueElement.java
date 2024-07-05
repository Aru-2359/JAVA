import java.util.Scanner;

public class UniqueElement {
    static int uniqueElement(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    arr[i]=arr[j]=-1;
                }
            }
        }
        int ans =-1;
        for(int i=0; i <n ; i++) {
            if(arr[i] > 0){
                ans = arr[i];
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
        int answer = uniqueElement(arr);
        System.out.println("The unique element is: "+answer);
        sc.close();
    }
}

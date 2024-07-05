import java.util.Scanner;
public class TripletSum {
    static int tripletSum(int[] arr, int x){
        int ans=0;
        int n= arr.length;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++) {
                    if(arr[i]+arr[j]+arr[k]==x){
                        System.out.println("Triplet found: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        ans++;
                    }
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
        int answer = tripletSum(arr,target);
        System.out.println("The number of triplets is: "+answer);
        sc.close();
    }
}

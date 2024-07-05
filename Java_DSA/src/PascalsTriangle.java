import java.util.Scanner;

public class PascalsTriangle {
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for(int i = 0; i < n; i++){
            ans[i] = new int[i + 1]; //as ith row has (i + 1) columns
            ans[i][0] = ans[i][i] = 1; //as first and last elements of every row are 1s
            for(int j = 1; j < i; j++){ //as 0th and ith columns are already filled by 1s
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the Pascal's triangle: ");
        int n = sc.nextInt();
        int[][] ans = pascal(n);
        printMatrix(ans);
        sc.close();
    }
}


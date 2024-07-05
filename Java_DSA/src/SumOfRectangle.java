import java.util.Scanner;

class SumOfRectangle{
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    /* Method 1 : Brute-force Method
    static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){ 
        int sum = 0;
        for(int i = l1; i <= l2; i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    */

    /* Method 2 : Pre-calculating the horizontal sum for each row
    static void findPrefixSum(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    static int findSum2(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        findPrefixSum(matrix);
        for(int i = l1; i <= l2; i++){
            if(r1 >= 1){
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            }
            else{
                sum += matrix[i][r2];
            }
        }
        return sum;
    }
    */

    // Method 3 : Prefix Sum overboth rows and columns
    static void findPrefixSum2(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i = 0; i < r; i++){
            for(int j = 1; j < c; j++){
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        for(int j = 0; j < c; j++){
            for(int i = 1; i < r; i++){
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }

    static int findSum3(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans = 0, sum = 0, left = 0, up = 0, leftup = 0;
        findPrefixSum2(matrix);
        sum = matrix[l2][r2];
        if(l1 >= 1){
            up = matrix[l1 -1][r2];
        }
        if(r1 >= 1){
            left = matrix[l2][r1 - 1];
        }
        if(l1 >= 1 && r1 >= 1){
            leftup = matrix[l1 - 1][r1 - 1];
        }
        ans = sum - left - up + leftup;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Enter " + n * m + " elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the row number of the first point: ");
        int l1 = sc.nextInt();
        System.out.print("Enter the column number of the first point: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the row number of the second point: ");
        int l2 = sc.nextInt();
        System.out.print("Enter the column number of the second point: ");
        int r2 = sc.nextInt();
        // int sum = findSum(matrix, l1, r1, l2, r2);
        //int sum = findSum2(matrix, l1, r1, l2, r2);
        int sum = findSum3(matrix, l1, r1, l2, r2);
        System.out.println("The sum of the elements enclosed within the rectangle formed by (" +l1+ ", "+r1+") and ("+l2+", "+r2+") is: "+sum);
        sc.close();
    }
}
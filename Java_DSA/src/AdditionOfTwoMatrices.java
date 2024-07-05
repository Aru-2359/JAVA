import java.util.Scanner;

public class AdditionOfTwoMatrices {
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] sumOfTwoMatrices(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong Input--Addition is not possible!");
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number of rows of the second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];
        System.out.println("Enter the elements of the second matrix: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        int[][] sum= sumOfTwoMatrices(arr1, r1, c1, arr2, r2, c2);
        System.out.println("The sum of the two matrices is: ");
        printMatrix(sum);
        sc.close();
    }
}

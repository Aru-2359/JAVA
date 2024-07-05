import java.util.Scanner;

public class TransposeInPlace {
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposeMatrixInPlace(int[][] matrix, int r, int c){
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        transposeMatrixInPlace(arr, r, c);
        System.out.println("The transpose of the matrix is: ");
        printMatrix(arr);
        sc.close();
    }
}

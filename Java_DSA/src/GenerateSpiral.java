import java.util.Scanner;

public class GenerateSpiral {
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiral(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int curr = 1;
        while(curr <= n * n){
            //topRow -> leftCol to rightCol
            for(int j = leftCol; j <= rightCol && curr <= n * n; j++){
                matrix[topRow][j] = curr;
                curr++;
            }
            topRow++; //so that it points to the next row

            //rightCol -> topRow to bottomRow
            for(int i = topRow; i <= bottomRow && curr <= n * n; i++){
                matrix[i][rightCol] = curr;
                curr++;
            }
            rightCol--; //so that it points to the previous col

            //bottomRow -> rightCol to leftCol  
            for(int j = rightCol; j >= leftCol && curr <= n * n; j--){
                matrix[bottomRow][j] = curr;
                curr++;
            }
            bottomRow--; //so that it points to the previous row

            //leftCol -> bottomRow to topRow  
            for(int i = bottomRow; i >= topRow && curr <= n * n; i--){
                matrix[i][leftCol] = curr;
                curr++;
            }
            leftCol++; //so that it points to the next col
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int [][] m = generateSpiral(n);
        System.out.println("Spiral Matrix generated:");
        printMatrix(m);
        sc.close();
    }
}

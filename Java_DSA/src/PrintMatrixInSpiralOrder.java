import java.util.Scanner;

class PrintMatrixInSpiralOrder{
    static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void printSpiralOrder(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElements = 0;
        /*we are checking totalElements < r * c for each loop as maybe 
        after printing the elements in one or two or three loop(s), 
        totalElements becomes >= r * c*/
        while(totalElements < r * c){
            //topRow -> leftCol to rightCol
            for(int j = leftCol; j <= rightCol && totalElements < r * c; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++; //so that it points to the next row

            //rightCol -> topRow to bottomRow
            for(int i = topRow; i <= bottomRow && totalElements < r * c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--; //so that it points to the previous col

            //bottomRow -> rightCol to leftCol  
            for(int j = rightCol; j >= leftCol && totalElements < r * c; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--; //so that it points to the previous row

            //leftCol -> bottomRow to topRow  
            for(int i = bottomRow; i >= topRow && totalElements < r * c; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++; //so that it points to the next col
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int c = sc.nextInt();
        int totalElements = r * c;
        int[][] a = new int[r][c];
        System.out.println("Enter " +totalElements + " elements of the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix:");
        printMatrix(a);
        System.out.println("Elements in Spiral Order:");
        printSpiralOrder(a, r, c);
        sc.close();
    }
}
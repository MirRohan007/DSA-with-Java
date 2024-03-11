import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        printSpiralArray();
        transposeOfAMatrix();
    }

    public static void printSpiralArray() {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = readMatrix(sc, rows, cols);

        System.out.println("Spiral order of the matrix is:");
        printSpiral(matrix, rows, cols);
    }

    private static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

    private static void printSpiral(int[][] matrix, int rows, int cols) {
        int row_start = 0;
        int row_end = rows - 1;
        int col_start = 0;
        int col_end = cols - 1;

        while (row_start <= row_end && col_start <= col_end) {
            printRow(matrix, row_start, col_start, col_end);
            row_start++;

            printColumn(matrix, col_end, row_start, row_end);
            col_end--;

            printRowReverse(matrix, row_end, col_start, col_end);
            row_end--;

            printColumnReverse(matrix, col_start, row_start, row_end);
            col_start++;

        }
    }

    private static void printRow(int[][] matrix, int row, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(matrix[row][i] + " ");
        }
    }

    private static void printColumn(int[][] matrix, int col, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(matrix[i][col] + " ");
        }
    }

    private static void printRowReverse(int[][] matrix, int row, int start, int end) {
        for (int i = end; i >= start; i--) {
            System.out.print(matrix[row][i] + " ");
        }
    }

    private static void printColumnReverse(int[][] matrix, int col, int start, int end) {
        for (int i = end; i >= start; i--) {
            System.out.print(matrix[i][col] + " ");
        }
    }

    public static void transposeOfAMatrix(){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][]matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}

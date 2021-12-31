package lecture7;

public class LinearAlgebra {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        printMatrix(matrix);

        int[][] transpose = transpose(matrix);
        printMatrix(transpose);

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6},};
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}, {5, 6, 7}};
        int[][] sum = add(matrix1, matrix2);
        int[][] product = multiply(matrix1, matrix2);

        printMatrix(matrix1);
        printMatrix(matrix2);
        printMatrix(sum);
        printMatrix(product);
    }

    public static void printMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printTranspose(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < numRows; row++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] transpose(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        // Declares the shape of the transpose matrix
        int[][] transpose = new int[numCols][numRows];
        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < numRows; row++) {
                // Assign values to the transpose matrix
                transpose[col][row] = matrix[row][col];
            }
        }
        return transpose;
    }

    // lhs: left-hand side
    // rhs: right-hand side
    public static int[][] add(int[][] lhs, int[][] rhs) {
        int numRows = lhs.length;
        int numCols = lhs[0].length;
        int[][] sum = new int[numRows][numCols];
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                sum[row][col] = lhs[row][col] + rhs[row][col];
            }
        }
        return sum;
    }

    // matrix-matrix multiplication
    public static int[][] multiply(int[][] lhs, int[][] rhs) {
        int numRows = lhs.length;
        int numCols = rhs[0].length;
        int[][] product = new int[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                int numElements = lhs[0].length;
                for (int i = 0; i < numElements; i++) {
                    product[row][col] += lhs[row][i] * rhs[i][col];
                }
            }
        }

        return product;
    }

    // matrix-scalar multiplication
    public static int[][] multiply(int[][] matrix, int c) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        int[][] product = new int[numRows][numCols];

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                product[row][col] = matrix[row][col] * c;
            }
        }

        return product;
    }
}

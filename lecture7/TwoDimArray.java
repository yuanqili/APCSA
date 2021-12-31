package lecture7;

public class TwoDimArray {

    public static void main(String[] args) {

        double[][] matrix = new double[10][20];

        System.out.println("Traverses a 2D array using nested for-loops");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Traverses a 2D array using enhanced for-loops");
        for (double[] row : matrix) {
            for (double col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        String[][] pyramid = new String[9][];
        for (int i = 0; i < pyramid.length; i++) {
            pyramid[i] = new String[i+1];
        }

        for (int row = 0; row < pyramid.length; row++) {
            for (int col = 0; col < pyramid[row].length; col++) {
                pyramid[row][col] = String.format("%d*%d=%2d", col+1, row+1, (row+1) * (col+1));
            }
        }

        System.out.println();
        System.out.println("Traverses a 2D pyramid using enhanced for-loops");
        for (String[] row : pyramid) {
            for (String col : row) {
                System.out.print(col + "   ");
            }
            System.out.println();
        }

    }

}

package lecture7;

public class TwoDimArrayTutorial {

    public static void main(String[] args) {

//        int[] values = {1, 2, 3};
//        print1DArray(values);
//
//        for (int value : values) {
//            value = 99;
//        }
//        print1DArray(values);
//
//        int[][] matrix = new int[3][4];
//        print2DArray(matrix);
//
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                matrix[row][col] = row * col;
//            }
//        }
//        print2DArray(matrix);

//        int[][] values2D = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//        };
//        for (int[] row: values2D) {
//            for (int col: row) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();

        int[][] values2D = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };



    }

    public static void print1DArray(int[] numbers) {
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void print2DArray(int[][] numbers) {
        // Traverses through rows of the matrix
        for (int row = 0; row < numbers.length; row++) {
            // Traverses through columns of a specific row of the matrix
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}

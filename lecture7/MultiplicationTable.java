package lecture7;

public class MultiplicationTable {

    public static void main(String[] args) {

        // initializes the 2d array for the multiplication table
        String[][] table = new String[9][];
        for (int row = 0; row < table.length; row++) {
            table[row] = new String[row + 1];
        }

        // calculates each cell in this table
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = (row+1) + "*" + (col+1) + "=" + (row+1) * (col+1);
            }
        }

        // prints out the table
        for (String[] row : table) {
            for (String cell : row) {
                System.out.print(cell + "   ");
            }
            System.out.println();
        }
    }

}

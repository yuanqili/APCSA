package lecture7;

public class EscapingDog {

    public static void main(String[] args) {

        int row = 10;
        int col = 20;

        int trials = 10000;
        int numDeadEnd = 0;

        for (int i = 0; i < trials; i++) {
            if (walk(row, col) == false)
                numDeadEnd += 1;
        }

        System.out.println("Out of " + trials + " trials, the dog has come to a dead end " + numDeadEnd + " times");

    }

    public static boolean walk(int row, int col) {
        // TODO: implement 2d random walk
        return false;
    }
}

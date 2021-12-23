package lecture6;

public class SquaredSum {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int xSquared = x * x;
        int ySquared = y * y;
        int sum = xSquared + ySquared;

        int sum1 = squaredSum(10, 20);

//        int sum2 = squaredSum(20, 30);
//        int sum3 = squaredSum(30, 50);
        System.out.println("sum: " + sum);
    }

    // modifier: public static
    // returnType: int
    // functionNme: squaredSum
    // parameters:
    // - 1: (int x)
    // - 2: (int y)
    public static int squaredSum(int x, int y) {
        int xSquared = x * x;
        int ySquared = y * y;
        int sum = xSquared + ySquared;
        return sum;
    }
}

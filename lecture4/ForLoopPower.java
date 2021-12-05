package lecture4;

public class ForLoopPower {
    public static void main(String[] args) {
        
        int n = 16;
        int value = 1;

        for (int power = 0;  power <= n; power++) {
            System.out.println("2^" + power + " = " + value);
            value *= 2;
        }
    }
}

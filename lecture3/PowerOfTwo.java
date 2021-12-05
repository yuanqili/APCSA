package lecture3;

public class PowerOfTwo {
    public static void main(String[] args) {
        int i = 0;  // power
        int v = 1;  // value
        int n = 50; // to which power the loop stops
        // max integer: 2^31-1
        while (i <= n) {
            System.out.println(v);
            i = i + 1;
            v = v * 2;
        }
    }
}

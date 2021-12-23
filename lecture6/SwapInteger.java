package lecture6;

public class SwapInteger {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("[main] x: " + x + ", y: " + y);

        swap(10, 20);
        System.out.println("[main] x: " + x + ", y: " + y);
    }

    // No side effect, pure method/function
    public static void swap(int x, int y) {
        System.out.println("[swap] x: " + x + ", y: " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("[swap] x: " + x + ", y: " + y);
    }
}

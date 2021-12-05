package lecture3;

public class TwoSort {
    public static void main(String[] args) {
        // Parses command line arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Switches a and b if b is smaller than a
        if (b < a) {
            int temp = b;
            b = a;
            a = temp;
        }

        // Outputs the value
        System.out.println("The smaller variable a is " + a);
        System.out.println("The larger variable b is " + b);
    }
}

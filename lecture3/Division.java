package lecture3;

public class Division {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (b == 0) {
            System.out.println("Division by zero, please try again");
        } else {
            int result = a / b;
            System.out.println("a / b = " + result);
        }
        System.out.println("Goodbye");
    }
}

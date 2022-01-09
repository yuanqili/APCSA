package lecture8;

public class DataTypes {

    public static void main(String[] args) {

        // primitive data type
        int integer = 42;
        double value = 42.0;
        boolean flag = true;
        char character = ' ';

        // reference data type
        // new, create, construct, instantiate
        int[] values = new int[10];
        String message = new String("Hello" + " " + "World!");
        // System.out.println(string.toUpperCase());
        // System.out.println(string.toLowerCase());
        // .substring(x, y) => [x, y)
        System.out.println(message);
        System.out.println(message.substring(2, 7));
    }

}

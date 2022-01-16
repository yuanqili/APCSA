package lecture9;

public class JavaExceptions {

    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4};

        // - The following ine of code will throw an exception
        // - Error
        // - Cause an exception
        // ArrayIndexOutOfBoundsException
        System.out.println(numbers[numbers.length]);

    }

}

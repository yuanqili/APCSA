package lecture7;

import java.util.Arrays;

public class DuplicateElement {

    public static void main(String[] args) {
        int[] numbers = {44, 22, 99, 55, 66, 33, 22, 66, 77, 88, 44, 22};
        System.out.println(Arrays.toString(numbers));
        System.out.println(firstDuplicate(numbers));
    }

    public static int firstDuplicate(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            for (int j = 0; j < i; j++) {
                if (numbers[i] == value) {
                    return value;
                }
            }
        }
        return -1;
    }

    public static boolean hasDuplicate(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            for (int j = 0; j < i; j++) {
                if (numbers[i] == value) {
                    return true;
                }
            }
        }
        return false;
    }

}

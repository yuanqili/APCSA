package lecture7;

import java.util.Arrays;

public class Mode {

    public static int mode(int[] numbers) {

        int mode = numbers[0];
        int maxCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            int count = 1;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == value)
                    count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        int[] numbers = {44, 22, 44, 55, 66, 33, 22, 66, 77, 88, 44, 22};
        System.out.println(Arrays.toString(numbers));
        System.out.println(mode(numbers));
    }

}

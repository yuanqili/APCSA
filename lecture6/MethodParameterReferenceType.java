package lecture6;

import java.util.Arrays;

public class MethodParameterReferenceType {

    public static void main(String[] args) {

        int[] intValues = new int[10];
        System.out.println(Arrays.toString(intValues));

        modifyArray(intValues);
        System.out.println(Arrays.toString(intValues));
    }

    // The method below has some side effects modifying outside array
    public static void modifyArray(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            ints[i] += 1;
        }
    }

}

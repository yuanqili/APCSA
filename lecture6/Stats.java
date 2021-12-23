package lecture6;

import java.util.Arrays;

public class Stats {

    public static void main(String[] args) {
        double[] values = { 1.0, 2.0, 3.0, 3.5, 1.0, 2.1 };
        printArray(values);
        bubbleSort(values);
        printArray(values);
    }

    public static void printArray(double[] array) {
        System.out.println("Array: " + Arrays.toString(array));
    }

    public static void printStats(double[] array) {
        printArray(array);
        System.out.println("  Max: " + max(array));
        System.out.println("  Min: " + min(array));
        System.out.println("Range: " + range(array));
        System.out.println("  Sum: " + sum(array));
        System.out.println(" Mean: " + mean(array));
        System.out.println("  Var: " + variance(array));
        System.out.println("StDev: " + standardDeviation(array));
    }

    /**
     * Increments each element of the array by one.
     */
    public static void increment(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 1;
        }
    }

    /**
     * Returns the maximum value of the array.
     */
    public static double max(double[] array) {
        double maxSoFar = array[0];
        for (double v : array) {
            if (v > maxSoFar) {
                maxSoFar = v;
            }
        }
        return maxSoFar;
    }

    /**
     * Returns the minimum value of the array.
     */
    public static double min(double[] array) {
        double minSoFar = array[0];
        for (double v : array) {
            if (v < minSoFar) {
                minSoFar = v;
            }
        }
        return minSoFar;
    }

    /**
     * Returns the sum of the array.
     */
    public static double sum(double[] array) {
        double sum = 0;
        for (double v : array) {
            sum += v;
        }
        return sum;
    }

    /**
     * Returns the range of the array.
     */
    public static double range(double[] array) {
        return max(array) - min(array);
    }

    /**
     * Returns the mean value of the array.
     */
    public static double mean(double[] array) {
        return sum(array) / array.length;
    }

    /**
     * Returns the variance of the array.
     */
    public static double variance(double[] array) {
        double mean = mean(array);
        double squaredSum = 0;
        for (double v : array) {
            squaredSum += Math.pow(v - mean, 2);
        }
        return squaredSum / (array.length - 1);
    }

    /**
     * Returns the standard deviation of the array.
     */
    public static double standardDeviation(double[] array) {
        return Math.sqrt(variance(array));
    }

    /**
     * Sorts the array using bubble sort algorithm.
     */
    public static void bubbleSort(double[] array) {
        for (int indexTobeSorted = array.length - 1; indexTobeSorted > 0; indexTobeSorted--) {
            for (int index = 0; index < indexTobeSorted; index++) {
                if (array[index] > array[index + 1]) {
                    double temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
    }

    /**
     * Returns the mode of the array.
     */
    public static double mode(double[] array) {
        // TODO: implement mode finding algorithm
        return 0.0;
    }

    /**
     * Determines if there is a duplicate element in the array.
     */
    public static boolean hasDuplicate(double[] array) {
        // TODO: implement duplicate finding algorithm
        return false;
    }

    public static boolean hasNegative(double[] array) {
        for (double v : array) {
            if (v < 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean allNegative(double[] array) {
        for (double v: array) {
            if (v >= 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Finds the first index of some value.
     * @return the first index of the value, -1 if not exist
     */
    public static int indexOf(double[] array, double value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}

package lecture8;

import java.util.Arrays;

public class Stats {

    private double[] values;

    Stats(double[] values) {
        this.values = values;
    }

    public double[] getValues() {
        return values;
    }

    public void setValues(double[] values) {
        this.values = values;
    }

    public void printArray() {
        System.out.println("Array: " + Arrays.toString(values));
    }

    public void describe() {
        printArray();
        System.out.println("Max: " + max());
        System.out.println("Min: " + min());
    }

    public void increment() {
        for (int i = 0; i < values.length; i++) {
            values[i] += 1;
        }
    }

    public double max() {
        double maxSoFar = values[0];
        for (double v : values) {
            if (v > maxSoFar) {
                maxSoFar = v;
            }
        }
        return maxSoFar;
    }

    public double min() {
        double minSoFar = values[0];
        for (double v : values) {
            if (v < minSoFar) {
                minSoFar = v;
            }
        }
        return minSoFar;
    }
}

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        // The input array of integers (or you can replace it by a double array)
        int[] array = {18, 32, -11, 6, 68, 2, -34};

        // Prints the array elements to the console
        System.out.format("The unsorted array is: %s\n", Arrays.toString(array));

        // Records time of start, for displaying algorithm statistics
        Instant timeStart = Instant.now();

        // TODO: You are going to implement Bubble Sort here, replace the
        // following nested loop with a real implementation
        for (...) {
            for (...) {
                ...
            }
        }

        // Records the time of finished, for displaying algorithm statistics
        Instant timeFinished = Instant.now();
        // Prints the sorted array and algorithm statistics
        System.out.format("The sorted array is: %s\n", Arrays.toString(array));
        System.out.format("Started bubble sort at  %s\n", timeStart.toString());
        System.out.format("Finished bubble sort at %s\n", timeFinished.toString());
        System.out.format("Finished bubble sort in %d nanoseconds\n", Duration.between(timeStart, timeFinished).toNanos());
    }
}

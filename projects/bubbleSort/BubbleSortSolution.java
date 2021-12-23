import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class BubbleSortSolution {

    public static void main(String[] args) {

        // The input array of integers (or you can replace it by a double array)
        int[] array = {18, 32, -11, 6, 68, 2, -34};

        // Prints the array elements to the console
        System.out.format("The unsorted array is: %s\n", Arrays.toString(array));

        // Records time of start, for displaying algorithm statistics
        Instant timeStart = Instant.now();

        // Bubble sort
        for (int indexTobeSorted = array.length - 1; indexTobeSorted > 0; indexTobeSorted--) {
            for (int index = 0; index < indexTobeSorted; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
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

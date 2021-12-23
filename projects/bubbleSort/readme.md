# Bubble Sort

**Bubble sort** is a sorting algorithm that works by **comparing the adjacent elements** and swapping them based on **ascending** or **descending** sorting criteria until the array is in the expected order.

Suppose we have an unsorted array, `[18, 32, -11, 6, 68, 2, -34]`, and we'd like to sort it in **ascending** order, i.e., large elements are placed at the end.

|Index|Numbers|
|----:|------:|
|    0|     18|
|    1|     32|
|    2|    -11|
|    3|      6|
|    4|     68|
|    5|      2|
|    6|    -34|

We iterate the array from left to right and do sorting for the last index which is called as `indexToBeSorted`.

We iterate the unsorted array one by one starting from index `0` to `indexToBeSorted` and in each iteration, we compare

- the value of the current `index`, with
- the value of `index+1`.

If the value of the current `index` is greater than value of `index+1`, then we swap these values. We do this until we reach the `indexToBeSorted`. In this way, we sort the values for `indexToBeSorted` and the biggest number moved to the `indexToBeSorted` position.

After the first sort iteration for `indexToBeSorted`, we decrease `indexToBeSorted` by 1 and do the same operations until the `indexToBeSorted` value is greater than zero. In this way, we can sort the unsorted array in ascending order using bubble sort.

## Example

Suppose we have an unsorted array, `[18, 32, -11, 6, 68, 2, -34]`, and we'd like to sort it in **ascending** order, i.e., large elements are placed at the end.

|Index|Numbers|
|----:|------:|
|    0|     18|
|    1|     32|
|    2|    -11|
|    3|      6|
|    4|     68|
|    5|      2|
|    6|    -34|

In the following figures,

- **index to be sorted** is in **purple**,
- **the current index** is in **red**,
- **the current+1 index** is in **yellow**, and
- **the done sorted element** is in **green**.

### First iteration

At the first iteration, the index to be sorted is 6, i.e., the length of the whole array. After this iteration, index 6 will contains the correct element.

![img](https://604223-1956433-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2021/11/bubble-sort-1.png)

### Second iteration

At the second iteration, the index to be sorted is decremented by one to 5. After this iteration, index since 5 will all contain the correct elements.

![img](https://604223-1956433-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2021/11/bubble-sort-2.png)

### Third iteration

At the third iteration, the index to be sorted is decremented by one to 4. After this iteration, index since 4 will all contain the correct elements.

![img](https://604223-1956433-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2021/11/bubble-sort-3.png)

### Fourth iteration

At the fourth iteration, the index to be sorted is decremented by one to 3. After this iteration, index since 3 will all contain the correct elements.

![img](https://604223-1956433-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2021/11/bubble-sort-4.png)

### Fifth iteration

At the fourth iteration, the index to be sorted is decremented by one to 2. After this iteration, index since 2 will all contain the correct elements.

![img](https://604223-1956433-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2021/11/bubble-sort-5.png)

### Sixth iteration

At the fourth iteration, the index to be sorted is decremented by one to 1. After this iteration, index since 1 will all contain the correct elements. Note that since we have sorted all elements except the first one (index 0), we do not need to sort the first element, which will be sorted automatically.

![img](https://604223-1956433-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2021/11/bubble-sort-6.png)

## Bubble sort in Java

Now, try to implement bubble sort in Java, with the supplied code template.

> You might need to add an extra `package xxx;` on top of the following code, depending on your directory structure.

### Code template

```java
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
```

### Example output

```
The unsorted array is: [18, 32, -11, 6, 68, 2, -34]
The sorted array is: [-34, -11, 2, 6, 18, 32, 68]
Started bubble sort at  2021-12-12T13:34:57.742720Z
Finished bubble sort at 2021-12-12T13:34:57.742729Z
Finished bubble sort in 9000 nanoseconds
```

package strategyarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // array of integers to be sorted
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        // creating context object
        Context context = new Context();

        // using bubble sort strategy
        context.setSortStrategy(new BubbleSort());
        context.executeSort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // resetting the array to its original unsorted state
        numbers = new int[]{64, 34, 25, 12, 22, 11, 90};

        // using insertion sort strategy
        context.setSortStrategy(new InsertionSort());
        context.executeSort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}

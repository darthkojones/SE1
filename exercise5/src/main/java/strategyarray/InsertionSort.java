package strategyarray;

// implementation of insertion sort algorithm
public class InsertionSort implements SortStrategy {
    @Override
    public void sort(int[] numbers) {
        int n = numbers.length;
        for (int i = 1; i < n; ++i) {
            int key = numbers[i];
            int j = i - 1;

            // move elements greater than key one position ahead
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
        System.out.println("Sorted using Insertion Sort");
    }
}
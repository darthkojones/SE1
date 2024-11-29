package strategyarray;

// context class that uses a sorting strategy
public class Context {
    private SortStrategy sortStrategy;

    // method to set the sorting strategy at runtime
    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    // method to perform sorting using the current strategy
    public void executeSort(int[] numbers) {
        if (sortStrategy != null) {
            sortStrategy.sort(numbers);
        } else {
            System.out.println("No sorting strategy set");
        }
    }
}
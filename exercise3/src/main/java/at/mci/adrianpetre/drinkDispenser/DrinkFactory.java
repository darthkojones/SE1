package at.mci.adrianpetre.drinkDispenser;

/*
 * responsible for determining what drink to return based on the input hour
 */
public class DrinkFactory {

    // Method to get the appropriate Drink based on the hour
    public Drink getDrink(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
        
        // Determine which drink to return based on the input hour
        if (hour >= 6 && hour <= 15) {
            return new Coffee(); // Returns Coffee if between 6 AM and 3 PM
        } else if (hour >= 16 && hour <= 21) {
            return new Tea();    // Returns Tea if between 4 PM and 9 PM
        } else {
            return new Water();  // Returns Water for any other time
        }
    }
}


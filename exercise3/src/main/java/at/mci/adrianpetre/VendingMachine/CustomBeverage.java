package at.mci.adrianpetre.VendingMachine;

/**
 * custom beverage class 
 */
public class CustomBeverage implements Beverage {
    private final String type;
    private final int temperature;
    private final int size;
    private final boolean cream;
    private final boolean milk;
    private final boolean sugar;

    /**
     * Constructs a custom beverage
     * params are pretty self explanatory
     * 
     * @param type the type of beverage
     * @param temperature the temperature of the beverage
     * @param size the size of the beverage
     * @param cream whether the beverage contains cream
     * @param milk whether the beverage contains milk
     * @param sugar whether the beverage contains sugar
     */
    public CustomBeverage(String type, int temperature, int size, boolean cream, boolean milk, boolean sugar) {
        this.type = type;
        this.temperature = temperature;
        this.size = size;
        this.cream = cream;
        this.milk = milk;
        this.sugar = sugar;
    }

     /**
     * gets the description of the beverage
     *
     * @return a string description of the beverage, including size, temperature, type, and ingredients
     */
    @Override
    public String getDescription() {
        String creamDescription = cream ? "with cream" : "without cream";
        String sugarDescription = sugar ? "with sugar" : "without sugar";
        String milkDescription = milk ? "with milk" : "without milk";

        String temperatureDescription;
        if (temperature <= 10) {
            temperatureDescription = "cold";
        } else if (temperature > 10 && temperature <= 40) {
            temperatureDescription = "warm";
        } else {
            temperatureDescription = "hot";
        }

        String sizeDescription;
        if (size < 250) {
            sizeDescription = "small";
        } else if (size >= 250 && size <= 400) {
            sizeDescription = "medium";
        } else {
            sizeDescription = "large";
        }

        return "This is a " + sizeDescription + " " + temperatureDescription + " " + type + " " + creamDescription + " " + milkDescription + " " + sugarDescription;
    }
}

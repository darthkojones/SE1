package at.mci.adrianpetre.VendingMachine;

/**
 * class for building customizable beverage instances
 */
public class BeverageBuilder {
        private int temperature;
        private int size;
        private boolean cream;
        private boolean milk;
        private boolean sugar;
        private String type;

     /**
     * sets the temperature of the beverage
     *
     * @param temperature the temperature to set
     * @return current instance of BeverageBuilder
     */
    public BeverageBuilder setTemperature(int temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * sets the size of the beverage
     *
     * @param size the size to set
     * @return current instance of BeverageBuilder
     */
    public BeverageBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    /**
     * sets whether the beverage contains cream.
     *
     * @param cream True if cream is included, false otherwise
     * @return current instance of BeverageBuilder
     */
    public BeverageBuilder setCream(boolean cream) {
        this.cream = cream;
        return this;
    }

    /**
     * sets whether the beverage contains milk
     *
     * @param milk True if milk is included, false otherwise
     * @return current instance of BeverageBuilder
     */
    public BeverageBuilder setMilk(boolean milk) {
        this.milk = milk;
        return this;
    }

    /**
     * sets whether the beverage contains sugar
     *
     * @param sugar True if sugar is included, false otherwise
     * @return current instance of BeverageBuilder
     */
    public BeverageBuilder setSugar(boolean sugar) {
        this.sugar = sugar;
        return this;
    }

    /**
     * sets the type of the beverage
     *
     * @param type The type of beverage (Coffee, Tea)
     * @return current instance of BeverageBuilder
     */
    public BeverageBuilder setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * builds the beverage with the provided attributes
     *
     * @return a new instance of a beverage
     */
    public Beverage build() {
        return new CustomBeverage(type, temperature, size, cream, milk, sugar);
    }
}
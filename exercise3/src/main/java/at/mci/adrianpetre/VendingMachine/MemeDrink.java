package at.mci.adrianpetre.VendingMachine;

public class MemeDrink implements Beverage {
    private int temperature;
    private int size;
    private boolean cream;
    private boolean milk;
    private boolean sugar;

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int getTemperature() {
        return this.temperature;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void setCream(boolean hasCream) {
        this.cream = hasCream;
    }

    @Override
    public boolean hasCream() {
        return this.cream;
    }

    @Override
    public void setMilk(boolean hasMilk) {
        this.milk = hasMilk;
    }

    @Override
    public boolean hasMilk() {
        return this.milk;
    }

    @Override
    public void setSugar(boolean hasSugar) {
        this.sugar = hasSugar;
    }

    @Override
    public boolean hasSugar() {
        return this.sugar;
    }

    @Override
    public String getDescription() {
        String creamDescription = cream ? "frothy at the mouth," : "without cream";
        String sugarDescription = sugar ? "sweet like you" : "without sugar";
        String milkDescription = milk ? "milky just like your ex's boobs" : "without milk, just like your balls";

        String temperatureDescription;
        if (temperature <= 10) {
            temperatureDescription = "cold like your ex's heart";
        } else if (temperature > 10 && temperature <= 40) {
            temperatureDescription = "warm like your kind soul";
        } else {
            temperatureDescription = "hot like you";
        }

        String sizeDescription;
        if (size < 250) {
            sizeDescription = "teeny tiny like your willy";
        } else if (size >= 250 && size <= 400) {
            sizeDescription = "meh - so so ";
        } else {
            sizeDescription = "YUGE!";
        }

        return "This is a " + sizeDescription + " " + temperatureDescription + " drink " + creamDescription + " " + milkDescription + " " + sugarDescription;
    }
}

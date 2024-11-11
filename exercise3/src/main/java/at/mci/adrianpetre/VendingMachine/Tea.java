package at.mci.adrianpetre.VendingMachine;


//same as the coffee class, just with a different name
public class Tea implements Beverage {
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
    public String getDescription(){
        String creamDescription = cream ? " with cream " : " without cream";
        String sugarDescription = sugar ? " with sugar " : "without sugar ";
        String milkDescription = milk ? " with milk " : " without milk ";
        return "This is a " + size + " ml "+ temperature + " degrees Tea" + creamDescription + milkDescription + sugarDescription ; 
    }
}

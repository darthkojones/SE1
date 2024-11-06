package at.mci.adrianpetre.VendingMachine;

/*
 * Defines how the Beverages should look like
 * 
 */
public interface AbstractBeverage {
    // Define getter and setter methods for the properties
    void setTemperature(int temperature);
    int getTemperature();

    void setSize(int size);
    int getSize();

    void setCream(boolean hasCream);
    boolean hasCream();

    void setMilk(boolean hasMilk);
    boolean hasMilk();

    void setSugar(boolean hasSugar);
    boolean hasSugar();

    String getDescription();
}

package at.mci.adrianpetre.VendingMachine;

/*
 * Defines how the Beverages should look like
 *  this is an abstract class 
 */
public abstract Beverage {
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

package at.mci.adrianpetre.VendingMachine;

/**
 * creates the beverages using the builder patterrn
 */
public class VendingMachine {
    public static void main(String[] args) {
        Beverage coffee = new BeverageBuilder()
                .setType("Coffee")
                .setTemperature(90)
                .setSize(300)
                .setCream(true)
                .setMilk(false)
                .setSugar(true)
                .build();

        System.out.println(coffee.getDescription());

        Beverage tea = new BeverageBuilder()
                .setType("Tea")
                .setTemperature(25)
                .setSize(200)
                .setCream(false)
                .setMilk(true)
                .setSugar(false)
                .build();

        System.out.println(tea.getDescription());
    }
}

package at.mci.adrianpetre.VendingMachine;

/*
 * This definetly requires an abstract factory to solve
 */
public class VendingMachine {
    public static void main(String[] args) {
        BeverageFactory coffeeFactory = new CoffeeFactory();
        BeverageFactory memeFactory = new MemeFactory();

        //meme drink

        Beverage meme = memeFactory.createColdBeverage();
        Beverage meme1 = memeFactory.createWarmBeverage();
        Beverage meme2 = memeFactory.createHotBeverage();
        System.out.println(meme.getDescription());
        System.out.println(meme1.getDescription());
        System.out.println(meme2.getDescription());
        // Create a hot coffee
        Beverage hotCoffee = coffeeFactory.createHotBeverage();
        System.out.println(hotCoffee.getDescription());

        // Create a cold coffee
        Beverage coldCoffee = coffeeFactory.createColdBeverage();
        System.out.println(coldCoffee.getDescription());





        /* Initial testing
        Beverage coffee = new Coffee();
        coffee.setTemperature(80);
        coffee.setSize(300);
        coffee.setCream(true);
        coffee.setMilk(false);
        coffee.setSugar(true);

        System.out.println(coffee.getDescription());

        Beverage tea = new Tea();
        tea.setTemperature(70);
        tea.setSize(250);
        tea.setCream(false);
        tea.setMilk(true);
        tea.setSugar(true);

        System.out.println(tea.getDescription())*/
    }

}

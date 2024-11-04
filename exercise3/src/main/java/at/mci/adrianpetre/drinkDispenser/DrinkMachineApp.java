package at.mci.adrianpetre.drinkDispenser;

import java.util.Scanner;

public class DrinkMachineApp {

    public static void main(String[] args) {
        System.out.println("What's the time now?");
        Scanner scanner = new Scanner(System.in);
        int currentHour;
        currentHour = Integer.parseInt(scanner.nextLine());

        //we need to get the correct drink from the factory
        DrinkFactory factory = new DrinkFactory();
        Drink drink = factory.getDrink(currentHour);

        //now that we have the drink
        //let's dispense it
        if (drink !=null) {
            drink.dispense();
        }else{
            System.out.println("No drink available");
        }
    
    }

}

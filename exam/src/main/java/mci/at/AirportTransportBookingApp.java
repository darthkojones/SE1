package mci.at;

import java.util.Scanner;
//task 2 is at the bottom of this file
public class AirportTransportBookingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // we start the app by askin the user his name and location
        System.out.println("     Welcome to JetSet&LET'SGO! \nThe best airport transport booking app!\n***especially if your name is Andrea***");

        
        // lets see who's using the app
        System.out.println("\nplease enter your name:");
        String userName = scanner.nextLine();

        //where you at
        System.out.println("\nwhere are you at now? type:");
        System.out.println("1 for Innsbruck");
        System.out.println("2 for Jakarta");
        System.out.println("3 for Venice");
        System.out.println("4 forLas Vegas");

        //since we use factory, it should be easy to add a new ride
        System.out.println("5 for MARS");

        int locationChoice = scanner.nextInt();
        scanner.nextLine(); 

        // now we have the transport cases according to the assignment
        //innsbruck only taxi
        //jakarta taxi and bike
        //venice is vaporetto and taxi
        //and las vegas is taaxi and helicopter
        Transport transport = null;
        switch (locationChoice) {
            case 1: // Innsbruck
                System.out.println("\navailable transports: Taxi selected automatically");
                transport = TransportFactory.getTransport("Taxi");
                break;


            case 2: // Jakarta
                System.out.println("\navailable transports:");
                System.out.println("1 for Taxi");
                System.out.println("2 for Motorbike");
                int jakartaChoice = scanner.nextInt();
                if (jakartaChoice == 1) {
                    transport = TransportFactory.getTransport("Taxi");
                } else if (jakartaChoice == 2) {
                    transport = TransportFactory.getTransport("Motorbike");
                }
                break;

            case 3: // Venice
                System.out.println("\navailable transports:");
                System.out.println("1 for Taxi");
                System.out.println("2 for Vaporetto");
                int veniceChoice = scanner.nextInt();
                if (veniceChoice == 1) {
                    transport = TransportFactory.getTransport("Taxi");
                } else if (veniceChoice == 2) {
                    transport = TransportFactory.getTransport("Vaporetto");
                }
                break;

            case 4: // Las Vegas
                System.out.println("\navailable transports:");
                System.out.println("1 for Taxi");
                System.out.println("2 for Helicopter");
                int lasVegasChoice = scanner.nextInt();
                if (lasVegasChoice == 1) {
                    transport = TransportFactory.getTransport("Taxi");
                } else if (lasVegasChoice == 2) {
                    transport = TransportFactory.getTransport("Helicopter");
                }
                break;

            case 5: // MARS BITCHES
                System.out.println("\navailable transports: UFO");               
                transport = TransportFactory.getTransport("UFO");
                
                break;  

            default:
                System.out.println("\nif you're not in one of the 4 airports, did you land on mars?/?");
                System.exit(0);
        }

        // book or bust
        if (transport != null) {
            transport.bookRide();
        } else {
            System.out.println("\nain't got that one");
            System.exit(0);
        }


        // discount for  a certain special user winkwink
        double originalPrice = transport.getPrice(); // test pprice
        double finalPrice = originalPrice;

        System.out.println("\nthat's gonna cost you " + originalPrice + " smackaroonies");

        if (userName.equalsIgnoreCase("Andrea")) { //aNdReA is also accepted
            finalPrice = originalPrice * 0.5; // 50% discount
            System.out.println("\nBuon giorno Andrea! you're gettin a 50% discount for bein so cool");
        }

        System.out.println("\namount to pay is: " + finalPrice);

        // we gotta take the cash now
        System.out.println("\nhow you gonna give me yo $$?");
        System.out.println("1 for Credit Card");
        System.out.println("2 for PayPal");
        System.out.println("3 for Bank Transfer");
        //let's add a new payment method as well since we started offering services on mars too
        System.out.println("4 for Credit Chit");
        int paymentChoice = scanner.nextInt();
        PaymentMethod paymentMethod = null;

        switch (paymentChoice) {
            case 1:
                paymentMethod = new CreditCardPayment();
                break;
            case 2:
                paymentMethod = new PaypalPayment();
                break;
            case 3:
                paymentMethod = new BankTransferPayment();
                break;
            case 4:
                paymentMethod = new CreditChitPayment();
                break;
            default:
                System.out.println("your Jedi tricks don't work here, only credits");
                System.exit(0);
        }

        // Process Payment
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentMethod);
        paymentProcessor.executePayment(finalPrice);


        System.out.println("\nsummary: \n you booked a " + transport.getClass().getSimpleName() + " for " + finalPrice + " and paid with " + paymentMethod.toString());
        System.out.println("\n******************************************************************");
        System.out.println("* we here at JetSet&LET'SGO! like to say DOMO ARIGATTO MR ROBOTO *");
        System.out.println("******************************************************************\n");
        scanner.close();
    }
}


/*
    the pattenrs i've used for JetSet&LET'SGO!
    
    1 - FACTORY PATTERN 
    --------------------------------------
    the Factory Pattern makes adding different types of transport easy and clean
    instead of having one big messy "if-else" structure to decide whether we're creating a Taxi, Helicopter, or a UFO, the Factory provides a single point where we can request whatever type of transport we need 
    it's also super flexible when we need to add a new transport type, like i did with the UFO, just implemented it and updated the factory, no need for major changes in other parts of the code
    and it keeps things hella organized by separating the creation logic part from the main :workflow:

    yeah the Factory lets us create transport options without having to modify the core logic of the app, so like if cities want new transport options it'll be super easy and quick to implement


    
    2 - STRATEGY PATTERN 
    ---------------------------------------
    for handling all the ways to make it rain, iused the Strategy Pattern. 
    not everyone wants to pay the same way, and we’re dealing with Martians and all sorts of folks here, so we need to keep it flexible
    whether you're paying by credit card, PayPal, bank transfer, or a shiny credit chit, we need options

    so instead of hardcoding every possible way to pay, i created a family of "PaymentMethod" classes. each one is its own flavor - CreditCardPayment, PayPalPayment, BankTransferPayment, CreditChitPayment, you get the point. then we just slot in the one you need at runtime

    and what's extra cool? say Mars wants to introduce a Barter System ("Two space potatoes for a ride, please!") - no prob! i just add a `BarterPayment` class, and it's ready to go, without rewriting anything else. plus, it keeps the ride booking clean since the booking part doesn’t care how the payment is done

    this was called separation of concerns if i remember correctly: booking rides is one job, making people pay up is another

    
    TL;DR: 
    ------------------------------------------------
    - Factory Pattern helps us build rides easily and flexibly, need a UFO, helicopter, or a llama ride tomorrow? factory’s got your back
    - Strategy Pattern lets us add new ways to pay for those rides without overhauling the whole payment system

*/
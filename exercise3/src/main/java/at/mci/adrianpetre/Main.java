package at.mci.adrianpetre;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // we want to make a scanner
        // read the input from the user
        // create a new element
        // add the element to the periodic table
        // print the elements in the periodic table


        Scanner scanner = new Scanner(System.in); 
        PeriodicTable periodicTable = PeriodicTable.getInstance();

         
        //sample elements to populate our list with
        Element[] testElements = new Element[3];
        testElements[0] = ElementFactory.createElement("Hydrogen", "H", 1);
        testElements[1] = ElementFactory.createElement("Helium", "He", 2);
        testElements[2] = ElementFactory.createElement("Lithium", "Li", 3);
        periodicTable.addElements(testElements);

        //now let's ask for user input
        System.out.println("how many elements do you want to add?");
        int numElements = 0;

        //validate user input for number of elements
        //it should be a positive number greater than 0
        //if the input is not a number, we catch the exception and ask the user to enter a valid number
        while (true) {
            try {
                numElements = Integer.parseInt(scanner.nextLine());
                if (numElements < 1) {
                    System.out.println("Please enter a positive number");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        //now we ask for the element details
        for (int i = 0; i < numElements; i++) {
            System.out.println("\nEnter the details of the element " + (i + 1) + ":");
            String name = null;
            String symbol = null;
            int atomicNumber = 0;

            //validate the name
            //it should start with an uppercase letter followed by lowercase letters
            while (true) {
                System.out.println("Enter the name:");
                name = scanner.nextLine();
                if (name.matches("^[A-Z][a-z]*$")) {
                    break;
                } else {
                    System.out.println("Name must start with an uppercase letter followed by lowercase letters");
                }
            }

            //validate the symbol
            //it should be one or two letters with the first letter uppercase
            while (true) {
                System.out.println("Enter the symbol:");
                symbol = scanner.nextLine();
                if (symbol.matches("^[A-Z][a-z]?$")) {
                    break;
                } else {
                    System.out.println("Symbol must be one or two letters with the first letter uppercase");
                }
            }

            //validate the atomic number
            //it should be between 1 and 118
            while (true) {
                System.out.println("Enter the atomic number:");
                try {
                    atomicNumber = Integer.parseInt(scanner.nextLine());
                    if (atomicNumber >= 1 && atomicNumber <= 118) {
                        break;
                    } else {
                        System.out.println("Atomic number must be between 1 and 118");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            // create thge element and add it to the table
            try {
                Element element = ElementFactory.createElement(name, symbol, atomicNumber);
                periodicTable.addElement(element);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                //interesting idea is to decrement the counter so that the user can try again
                i--;
            } 
        }

        //close the scanner
        scanner.close();



        //print the elements in the periodic table
        System.out.println("\nElements in the periodic table:");
        for (Element element : periodicTable.getElements()) {
            System.out.println(element);
        }
    }
}

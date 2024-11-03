package at.mci.adrianpetre;
import java.util.Scanner;


/**
 * Division class that divides two numbers
 * 
 * @author darth
 */
public class Division {

    /**
     * main method used for testing of the Division class.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();
        

        /*
         * 
         */
        try {
            int a = firstNumber;
            int b = secondNumber;

            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed. Try it at your own peril! One false move and you go KABOOOOOOOOM!");
            }

            int result = a / b;

            System.out.println("The result of the division is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number (INT)");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}

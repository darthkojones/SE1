package proxy;

import java.util.Scanner;

public class ParentalControl {
     public static void main(String[] args) {
        WebPage webPage = new WebPageProxy();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a URL to visit (or type 'exit' to quit): ");
            String url = scanner.nextLine().toLowerCase();
            
            if (url.equalsIgnoreCase("exit")) {
                System.out.println("Exiting browser.");
                break;
            }

            webPage.render(url);
        }
    }
}

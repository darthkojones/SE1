package charmask;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter what you want masking: ");
        String input = scanner.nextLine();
        
        System.out.println("enter the letters to mask: ");
        String charsToMaskInput = scanner.nextLine();
        //thinking about it, could implement some regex bcuz right now 'a' and 'A' are treated differently
        
        char[] charsToMask = charsToMaskInput.replaceAll("\s", "").toCharArray();

        System.out.println("enter mask symbol: ");
        char maskChar = scanner.nextLine().charAt(0);
        //String input = "Andrea";
        //char[] charsToMask = {'a', 'e', 'z','A'};
        //char maskChar = '*';

        //convert the input string to an InputStream
        InputStream originalInputStream = new java.io.ByteArrayInputStream(input.getBytes());

        // wrap the original input stream with our MaskingInputStream
        try (InputStream maskingStream = new MaskingInputStream(originalInputStream, charsToMask, maskChar)) {
            int data;
            while ((data = maskingStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

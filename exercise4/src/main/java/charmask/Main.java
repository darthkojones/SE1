package charmask;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter what you want masking: \n");
        String input = scanner.nextLine();
        
        System.out.println("enter the letters to mask: \n");
        String charsToMaskInput = scanner.nextLine();
        char[] charsToMask = charsToMaskInput.replaceAll("\s", "").toCharArray();

        //System.out.println("enter mask symbol: \n");
        
        //String input = "Andrea";
        //char[] charsToMask = {'a', 'e', 'z','A'};
        char maskChar = '*';

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

package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coinage {
    public static void main(String args[]) throws IOException {
        int amount, thousands, fiveHundreds, hundreds, tens, fives, ones;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter amount in rupees: ");
        amount = Integer.parseInt(reader.readLine());

        //thousands = amount / 1000;
        //amount -= thousands * 1000;
        //fiveHundreds = amount / 500;
        //amount -= fiveHundreds * 500;
        //hundreds = amount / 100;
        //amount -= hundreds * 100;
        tens = amount / 100;
        amount -= tens * 100;
        fives = amount / 5;
        ones = amount - (fives * 5);

        System.out.println("\nNumber of 1000 rupee notes: " + thousands);
        System.out.println("Number of 500 rupee notes: " + fiveHundreds);
        System.out.println("Number of 100 rupee notes: " + hundreds);
        System.out.println("Number of 10 rupee notes: " + tens);
        System.out.println("Number of 5 rupee notes: " + fives);
        System.out.println("Number of 1 rupee notes: " + ones);
    }
}

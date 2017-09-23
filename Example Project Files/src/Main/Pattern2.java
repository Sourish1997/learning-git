package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern2 {
    public static void main(String args[]) throws IOException {
        String word;
        int wordSize;
        boolean reverse = false;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a word: ");
        word = reader.readLine();
        wordSize = word.length();

        for(int i = 0; i < wordSize && i >= 0; i++) {
            for(int j = 1; j < wordSize - i; j++)
                System.out.print(" ");
            for(int j = 0; j <= i; j++)
                System.out.print(word.charAt(j) + " ");

            if(i == wordSize - 1)
                reverse = true;
            if(reverse)
                i -= 2;

            System.out.println();
        }
    }
}

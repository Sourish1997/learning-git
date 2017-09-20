package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReversal {
    /*private static void newstr(String sentence) {
        System.out.print("\nSentence with reversed strings: ");

        String words[] = sentence.split(" ");
        for(String word: words) {
            for (int i = word.length() - 1; i >= 0; i--)
                System.out.print(word.charAt(i));
            System.out.print(" ");
        }
    }*/

    private static void newstr(String sentence) {
        System.out.print("\nSentence with reversed strings: ");

        sentence += " ";
        String reversedWord = "";
        for(int i = 0; i < sentence.length(); i++) {
            reversedWord = sentence.charAt(i) + reversedWord;
            if(sentence.charAt(i) == ' ') {
                System.out.print(reversedWord);
                reversedWord = "";
            }
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence: ");
        newstr(reader.readLine());
    }
}

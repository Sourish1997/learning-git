package Main;

public class Crypto {
    String s = "ABCXYZ";

    public String encodeDecode(int move) {
        String encodedString = "";
        move = move % 26;

        for(int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int newAsciiValue = (int) currentChar + move;

            if(Character.isLowerCase(currentChar)) {
                if(newAsciiValue < 97)
                    newAsciiValue = 26 + newAsciiValue;
                else if(newAsciiValue > 122)
                    newAsciiValue = newAsciiValue - 26;
            } else {
                if(newAsciiValue < 65)
                    newAsciiValue = 26 + newAsciiValue;
                else if(newAsciiValue > 90)
                    newAsciiValue = newAsciiValue - 26;
            }

            encodedString += (char) newAsciiValue + "";
        }

        return encodedString;
    }
}

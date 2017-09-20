package Main;

public class CryptoTester {
    public static void main(String args[]) {
        Crypto crypto = new Crypto();

        System.out.println(crypto.encodeDecode(11));

        System.out.println(crypto.encodeDecode(-3));
        System.out.println(crypto.encodeDecode(0));
        System.out.println(crypto.encodeDecode(-26));
        System.out.println(crypto.encodeDecode(26));
        System.out.println(crypto.encodeDecode(257));
        System.out.println(crypto.encodeDecode(-643));
    }
}

package Main;

public class Pattern1 {
    public static void main(String args[]) {
        boolean reverseOuter = false;

        for (int i = 5; i > 0 && i < 6; i--) {
            boolean reverseInner = false;

            for(int j = 1; j < 6 && j > 0; j++) {
                if(j <= i)
                    System.out.print(j);
                else
                    System.out.print(" ");

                if(j == 5)
                    reverseInner = true;
                if(reverseInner)
                    j -= 2;
            }

            if(i == 1)
                reverseOuter = true;
            if(reverseOuter)
                i += 2;

            System.out.println();
        }
    }
}

package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialSeriesSum {
    private static int factorial(int value) {
        int fac = 1;
        for(int i = 2; i <= value; i++)
            fac *= i;
        return fac;
    }

    public static void main(String args[]) throws IOException {
        int n, x, first = 0, second = 1;
        //double sum = 1;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Enter the value of n: ");
        n = Integer.parseInt(reader.readLine());
        //System.out.print("Enter the value of x: ");
        x = Integer.parseInt(reader.readLine());

        for(int i = 1; i < n; i++) {
            int cur = first + second;
            if (i % 2 == 0)
                sum += Math.pow(x, cur) / factorial(cur);
            //else
            //    sum -= Math.pow(x, cur) / factorial(cur);
            first = second;
            second = cur;
        }

        System.out.print("\nSum: " + sum);
    }
}

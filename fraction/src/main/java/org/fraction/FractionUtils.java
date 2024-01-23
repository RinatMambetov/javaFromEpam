package org.example;

public class FractionUtils {
    private FractionUtils() {
        throw new AssertionError("Cannot create instance of FractionUtils class");
    }

    //    НОД
    public static int getGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}

package org.example;

import java.util.List;

public class PolinomialGenerator {
    private PolinomialGenerator() {
        throw new AssertionError("Cannot create instance of PolinomialGenerator class");
    }

    public static Fraction generatePolinomial(int polinomialLength) {
        List<Fraction> fractions = FractionGenerator.generateListFractions(polinomialLength);
    }
}

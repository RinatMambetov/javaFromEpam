package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PolynomialGenerator {
    private PolynomialGenerator() {
        throw new AssertionError("Cannot create instance of PolynomialGenerator class");
    }

    public static Polynomial generatePolynomial(int polynomialLength) {
        if (polynomialLength < 1) {
            throw new IllegalArgumentException("Argument 'polynomialLength' is less then 1");
        }
        List<Fraction> fractions = FractionGenerator.generateListFractions(polynomialLength);
        return new Polynomial(fractions);
    }

    public static List<Polynomial> generateListPolynomial(int listLength, int polynomialLength) {
        if (listLength < 1) {
            throw new IllegalArgumentException("Argument 'listLength' is less then 1");
        }
        List<Polynomial> polynomials = new ArrayList<>();
        for (int i = 0; i < listLength; i++) {
            polynomials.add(generatePolynomial(polynomialLength));
        }
        return polynomials;
    }

    public static Polynomial[] generateArrayPolynomial(int arrayLength, int polynomialLength) {
        if (arrayLength < 1) {
            throw new IllegalArgumentException("Argument 'arrayLength' is less then 1");
        }
        Polynomial[] polynomials = new Polynomial[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            polynomials[i] = generatePolynomial(polynomialLength);
        }
        return polynomials;
    }

    public static Set<Polynomial> generateSetPolynomial(int setLength, int polynomialLength) {
        if (setLength < 1) {
            throw new IllegalArgumentException("Argument 'setLength' is less then 1");
        }
        Set<Polynomial> polynomials = new HashSet<>();
        for (int i = 0; i < setLength; i++) {
            polynomials.add(generatePolynomial(polynomialLength));
        }
        return polynomials;
    }
}


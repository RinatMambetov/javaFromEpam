package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class FractionGenerator {
    private FractionGenerator() {
        throw new AssertionError("Cannot create instance of GenerateFractions class");
    }

    public static Fraction generateFraction() {
        int m = ThreadLocalRandom.current().nextInt(FractionData.min, FractionData.max + 1);
        int n = 0;
        while (n == 0) {
            n = ThreadLocalRandom.current().nextInt(FractionData.min, FractionData.max + 1);
        }
        return new Fraction(m, n);
    }

    public static List<Fraction> generateListFractions(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("Argument 'k' is less then 1");
        }
        List<Fraction> fractions = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            fractions.add(generateFraction());
        }
        return fractions;
    }

    public static Fraction[] generateArrayFractions(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("Argument 'k' is less then 1");
        }
        Fraction[] fractions = new Fraction[k];
        for (int i = 0; i < k; i++) {
            fractions[i] = generateFraction();
        }
        return fractions;
    }

    public static Set<Fraction> generateSetFractions(int k) {
        if (k < 1) {
            throw new IllegalArgumentException("Argument 'k' is less then 1");
        }
        Set<Fraction> fractions = new HashSet<>();
        for (int i = 0; i < k; i++) {
            fractions.add(generateFraction());
        }
        return fractions;
    }
}

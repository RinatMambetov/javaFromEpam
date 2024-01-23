package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PolynomialHandle {
    private PolynomialHandle() {
        throw new AssertionError("Cannot create instance of PolynomialHandle class");
    }

    public static Polynomial sumPolynomials(Polynomial polynomial1, Polynomial polynomial2) {
        int length1 = polynomial1.getLength();
        int length2 = polynomial2.getLength();
        int minLength = Math.min(length1, length2);
        List<Fraction> fractions1 = polynomial1.getFractionsByDegrees();
        List<Fraction> fractions2 = polynomial2.getFractionsByDegrees();
        List<Fraction> resultFractions = new ArrayList<>();
        for (int i = 0; i < minLength; i++) {
            Fraction sum = FractionHandle.sumFractions(fractions1.get(i), fractions2.get(i));
            resultFractions.add(sum);
        }
        if (length1 > length2) {
            for (int i = minLength; i < length1; i++) {
                resultFractions.add(fractions1.get(i));
            }
        } else {
            for (int i = minLength; i < length2; i++) {
                resultFractions.add(fractions2.get(i));
            }
        }
        return new Polynomial(resultFractions);
    }

    public static Polynomial sumListPolynomials(List<Polynomial> polynomials) {
        Fraction fraction = new Fraction(0, 1);
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(fraction);
        Polynomial result = new Polynomial(fractions);
        for (Polynomial polynomial : polynomials) {
            result = sumPolynomials(result, polynomial);
        }
        return result;
    }

    public static Polynomial sumArrayPolynomials(Polynomial[] polynomials) {
        Fraction fraction = new Fraction(0, 1);
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(fraction);
        Polynomial result = new Polynomial(fractions);
        for (Polynomial polynomial : polynomials) {
            result = sumPolynomials(result, polynomial);
        }
        return result;
    }

    public static Polynomial sumSetPolynomials(Set<Polynomial> polynomials) {
        Fraction fraction = new Fraction(0, 1);
        List<Fraction> fractions = new ArrayList<>();
        fractions.add(fraction);
        Polynomial result = new Polynomial(fractions);
        for (Polynomial polynomial : polynomials) {
            result = sumPolynomials(result, polynomial);
        }
        return result;
    }
}

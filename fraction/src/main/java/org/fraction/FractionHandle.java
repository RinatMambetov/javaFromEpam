package org.fraction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FractionHandle {
    private FractionHandle() {
        throw new AssertionError("Cannot create instance of FractionHandle class");
    }

    public static Fraction sumFractions(Fraction fraction1, Fraction fraction2) {
        int numerator1 = fraction1.getNumerator();
        int denominator1 = fraction1.getDenominator();
        int numerator2 = fraction2.getNumerator();
        int denominator2 = fraction2.getDenominator();
        int numerator = numerator1 * denominator2 + numerator2 * denominator1;
        int denominator = denominator1 * denominator2;
        int gcd = FractionUtils.getGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return new Fraction(numerator, denominator);
    }

    public static Fraction[] handleFractionArray(Fraction[] fractions) {
        if (fractions == null) {
            throw new IllegalArgumentException("Argument 'fractions' is null");
        }
        Fraction[] result = new Fraction[fractions.length];
        for (int i = 0; i < result.length - 1; i++) {
            if (i % 2 == 0) {
                result[i] = sumFractions(fractions[i], fractions[i + 1]);
            } else {
                result[i] = new Fraction(fractions[i].getNumerator(), fractions[i].getDenominator());
            }
        }
        Fraction lastFraction = fractions[fractions.length - 1];
        result[result.length - 1] = new Fraction(lastFraction.getNumerator(), lastFraction.getDenominator());
        return result;
    }

    public static List<Fraction> handleFractionList(List<Fraction> fractions) {
        if (fractions == null) {
            throw new IllegalArgumentException("Argument 'fractions' is null");
        }
        List<Fraction> result = new ArrayList<>();
        for (int i = 0; i < fractions.size(); i++) {
            if (i % 2 == 0) {
                result.add(sumFractions(fractions.get(i), fractions.get(i + 1)));
            } else {
                result.add(new Fraction(fractions.get(i).getNumerator(), fractions.get(i).getDenominator()));
            }
        }
        result.add(fractions.get(fractions.size() - 1));
        return result;
    }

    public static Set<Fraction> handleFractionSet(Set<Fraction> fractions) {
        if (fractions == null) {
            throw new IllegalArgumentException("Argument 'fractions' is null");
        }
        List<Fraction> tempList = new ArrayList<>(fractions);
        tempList = handleFractionList(tempList);
        return new HashSet<>(tempList);
    }
}

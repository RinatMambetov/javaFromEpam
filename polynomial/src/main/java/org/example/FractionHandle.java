package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FractionHandle {
    public static Fraction sumFractions(Fraction fraction1, Fraction fraction2) {
        int m1 = fraction1.getM();
        int n1 = fraction1.getN();
        int m2 = fraction2.getM();
        int n2 = fraction2.getN();
        int m = m1 * n2 + m2 * n1;
        int n = n1 * n2;
        return new Fraction(m, n);
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
                result[i] = new Fraction(fractions[i].getM(), fractions[i].getN());
            }
        }
        Fraction lastFraction = fractions[fractions.length - 1];
        result[result.length - 1] = new Fraction(lastFraction.getM(), lastFraction.getN());
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
                result.add(new Fraction(fractions.get(i).getM(), fractions.get(i).getN()));
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

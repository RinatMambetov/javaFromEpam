package org.fraction;

import java.util.Objects;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Argument 'denominator' is 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fraction other = (Fraction) obj;
        return numerator == other.getNumerator() && denominator == other.getDenominator();
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "m=" + numerator +
                ", n=" + denominator +
                '}';
    }

}

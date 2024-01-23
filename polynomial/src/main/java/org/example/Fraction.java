package org.example;

import java.util.Objects;

public class Fraction {
    private final int m;
    private final int n;

    public Fraction(int m, int n) {
        if (n == 0) {
            throw new IllegalArgumentException("Argument 'n' is 0");
        }
        this.m = m;
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    @Override
    public int hashCode() {
        return Objects.hash(m, n);
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
        return m == other.getM() && n == other.getN();
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "m=" + m +
                ", n=" + n +
                '}';
    }

}

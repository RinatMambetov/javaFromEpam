package org.example;

import java.util.List;
import java.util.Objects;

public class Polynomial {
    private final List<Fraction> fractionsByDegrees;
    private final int length;

    public Polynomial(List<Fraction> fractionsByDegrees) {
        this.fractionsByDegrees = fractionsByDegrees;
        this.length = fractionsByDegrees.size();
    }

    public int hashCode() {
        return Objects.hash(fractionsByDegrees, length);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Polynomial other = (Polynomial) obj;

        return fractionsByDegrees.equals(other.getFractionsByDegrees()) && length == other.getLength();
    }

    @Override
    public String toString() {
        return "Polynomial{" +
                "fractionsByDegrees=" + fractionsByDegrees +
                '}';
    }

    public List<Fraction> getFractionsByDegrees() {
        return fractionsByDegrees;
    }

    public int getLength() {
        return length;
    }
}

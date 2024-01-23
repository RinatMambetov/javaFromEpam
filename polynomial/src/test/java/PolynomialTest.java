import org.example.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PolynomialTest {
    @Test
    void testPolynomialConstructor() {
        int fractionLength = 3;
        List<Fraction> fractions = FractionGenerator.generateListFractions(fractionLength);
        Polynomial polynomial = new Polynomial(fractions);
        assertNotNull(polynomial);
    }

    @Test
    void testPolynomialGenerator() {
        int polynomialLength = 3;
        Polynomial polynomial = PolynomialGenerator.generatePolynomial(polynomialLength);
        assertNotNull(polynomial);
    }

    @Test
    void testPolynomialListGenerator() {
        int listLength = 10;
        int polynomialLength = 3;
        List<Polynomial> polynomials = PolynomialGenerator.generateListPolynomial(listLength, polynomialLength);
        for (Polynomial polynomial : polynomials) {
            assertNotNull(polynomial);
            System.out.println(polynomial);
        }
    }

    @Test
    void testPolynomialArrayGenerator() {
        int arrayLength = 10;
        int polynomialLength = 3;
        Polynomial[] polynomials = PolynomialGenerator.generateArrayPolynomial(arrayLength, polynomialLength);
        for (Polynomial polynomial : polynomials) {
            assertNotNull(polynomial);
            System.out.println(polynomial);
        }
    }

    @Test
    void testPolynomialSetGenerator() {
        int setLength = 10;
        int polynomialLength = 3;
        Set<Polynomial> polynomials = PolynomialGenerator.generateSetPolynomial(setLength, polynomialLength);
        for (Polynomial polynomial : polynomials) {
            assertNotNull(polynomial);
            System.out.println(polynomial);
        }
    }

    @Test
    void testPolynomialGeneratorWithNegativeArgument() {
        int length = -1;
        assertThrows(IllegalArgumentException.class, () -> FractionGenerator.generateListFractions(length));
        assertThrows(IllegalArgumentException.class, () -> FractionGenerator.generateArrayFractions(length));
        assertThrows(IllegalArgumentException.class, () -> FractionGenerator.generateSetFractions(length));
    }

    @Test
    void testSumPolynomialsEqualLengths() {
        int length = 5;
        Polynomial polynomial1 = PolynomialGenerator.generatePolynomial(length);
        Polynomial polynomial2 = PolynomialGenerator.generatePolynomial(length);
        Polynomial polynomial = PolynomialHandle.sumPolynomials(polynomial1, polynomial2);
        System.out.println(polynomial);
    }

    @Test
    void testSumPolynomialsDiffLengths() {
        int length1 = 5;
        int length2 = 10;
        Polynomial polynomial1 = PolynomialGenerator.generatePolynomial(length1);
        Polynomial polynomial2 = PolynomialGenerator.generatePolynomial(length2);
        Polynomial polynomial = PolynomialHandle.sumPolynomials(polynomial1, polynomial2);
        System.out.println(polynomial);
    }

    @Test
    void testSumListPolynomials() {
        int listLength = 10;
        int polynomialLength = 5;
        List<Polynomial> polynomials = PolynomialGenerator.generateListPolynomial(listLength, polynomialLength);
        Polynomial sum = PolynomialHandle.sumListPolynomials(polynomials);
        System.out.println(sum);
    }

    @Test
    void testSumArrayPolynomials() {
        int listLength = 10;
        int polynomialLength = 5;
        Polynomial[] polynomials = PolynomialGenerator.generateArrayPolynomial(listLength, polynomialLength);
        Polynomial sum = PolynomialHandle.sumArrayPolynomials(polynomials);
        System.out.println(sum);
    }

    @Test
    void testSumSetPolynomials() {
        int listLength = 10;
        int polynomialLength = 5;
        Set<Polynomial> polynomials = PolynomialGenerator.generateSetPolynomial(listLength, polynomialLength);
        Polynomial sum = PolynomialHandle.sumSetPolynomials(polynomials);
        System.out.println(sum);
    }
}

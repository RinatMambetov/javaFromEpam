import org.fraction.Fraction;
import org.fraction.FractionGenerator;
import org.fraction.FractionHandle;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {
    @Test
    void testFractionCreate() {
        int numerator = 1;
        int denominator = 2;
        Fraction fraction = new Fraction(numerator, denominator);
        assertNotNull(fraction);
        assertEquals(numerator, fraction.getNumerator());
        assertEquals(denominator, fraction.getDenominator());
    }

    @Test
    void testZeroN() {
        int numerator = 1;
        int denominator = 0;
        assertThrows(IllegalArgumentException.class, () -> new Fraction(numerator, denominator));
    }

    @Test
    void testFractionGenerator() {
        Fraction fraction = FractionGenerator.generateFraction();
        System.out.println(fraction);
        assertNotNull(fraction);
    }

    @Test
    void testFractionsListGenerator() {
        int listLength = 10;
        List<Fraction> fractions = FractionGenerator.generateListFractions(listLength);
        for (Fraction fraction : fractions) {
            assertNotNull(fraction);
            System.out.println(fraction);
        }
    }

    @Test
    void testFractionsArrayGenerator() {
        int arrayLength = 10;
        Fraction[] fractions = FractionGenerator.generateArrayFractions(arrayLength);
        for (Fraction fraction : fractions) {
            assertNotNull(fraction);
            System.out.println(fraction);
        }
    }

    @Test
    void testFractionsSetGenerator() {
        int setLength = 10;
        Set<Fraction> fractions = FractionGenerator.generateSetFractions(setLength);
        for (Fraction fraction : fractions) {
            assertNotNull(fraction);
            System.out.println(fraction);
        }
    }

    @Test
    void testFractionsGeneratorWithNegativeArgument() {
        int length = -1;
        assertThrows(IllegalArgumentException.class, () -> FractionGenerator.generateListFractions(length));
        assertThrows(IllegalArgumentException.class, () -> FractionGenerator.generateArrayFractions(length));
        assertThrows(IllegalArgumentException.class, () -> FractionGenerator.generateSetFractions(length));
    }

    @Test
    void testHandleFractionArray() {
        int arrayLength = 10;
        Fraction[] fractions = FractionGenerator.generateArrayFractions(arrayLength);
        System.out.println(Arrays.toString(fractions));
        fractions = FractionHandle.handleFractionArray(fractions);
        System.out.println(Arrays.toString(fractions));
    }

    @Test
    void testHandleFractionList() {
        int listLength = 10;
        List<Fraction> fractions = FractionGenerator.generateListFractions(listLength);
        System.out.println(fractions);
        fractions = FractionHandle.handleFractionList(fractions);
        System.out.println(fractions);
    }

    @Test
    void testHandleFractionSet() {
        int setLength = 10;
        Set<Fraction> fractions = FractionGenerator.generateSetFractions(setLength);
        System.out.println(fractions);
        fractions = FractionHandle.handleFractionSet(fractions);
        System.out.println(fractions);
    }

    @Test
    void testHandleFractionWithNull() {
        assertThrows(IllegalArgumentException.class, () -> FractionHandle.handleFractionArray(null));
        assertThrows(IllegalArgumentException.class, () -> FractionHandle.handleFractionList(null));
        assertThrows(IllegalArgumentException.class, () -> FractionHandle.handleFractionSet(null));
    }
}

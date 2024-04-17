package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FractionTest {
    @Test
    public void testModEvenEl_EmptyList() {
        List<Fraction> fractions = new ArrayList<>();
        Fraction.modEvenEl(fractions);
        assertEquals(0, fractions.size());
    }

    @Test
    public void testModEvenEl_SingleElement() {
        List<Fraction> fractions = new ArrayList<>();
        Fraction fraction = new Fraction(1.0, 2.0, new ComplexNumber(1.0, 2.0));
        fractions.add(fraction);
        Fraction.modEvenEl(fractions);
        assertEquals(1, fractions.size());
        assertEquals(1.0, fraction.getM());
        assertEquals(4.0, fraction.getN());
    }

    @Test
    public void testModEvenEl_EvenElements() {
        List<Fraction> fractions = new ArrayList<>();
        Fraction fraction1 = new Fraction(1.0, 2.0, new ComplexNumber(1.0, 2.0));
        Fraction fraction2 = new Fraction(2.0, 3.0, new ComplexNumber(2.0, 3.0));
        Fraction fraction3 = new Fraction(3.0, 4.0, new ComplexNumber(3.0, 4.0));
        fractions.add(fraction1);
        fractions.add(fraction2);
        fractions.add(fraction3);
        assertEquals(3, fractions.size());
        assertEquals(1.0, fraction1.getM());
        assertEquals(4.0, fraction1.getN());
        assertEquals(4.0, fraction2.getM());
        assertEquals(9.0, fraction2.getN());
        assertEquals(9.0, fraction3.getM());
        assertEquals(16.0, fraction3.getN());
    }

    @Test
    public void testModEvenEl_OddElements() {
        List<Fraction> fractions = new ArrayList<>();
        Fraction fraction1 = new Fraction(3.0, 1.5, new ComplexNumber(2.25, 2.4));
        Fraction fraction2 = new Fraction(5.0, 3.4, new ComplexNumber(2.3, 3.6));
        Fraction fraction3 = new Fraction(2.0, 5.0, new ComplexNumber(5.6, 2.8));
        Fraction fraction4 = new Fraction(1.0, 7.0, new ComplexNumber(4.7, 6.7));
        fractions.add(fraction1);
        fractions.add(fraction2);
        fractions.add(fraction3);
        fractions.add(fraction4);
        assertEquals(4, fractions.size());
        assertEquals(6.75, fraction1.getM(),0.1);
        assertEquals(3.6, fraction1.getN(),0.1);
        assertEquals(11.5, fraction2.getM(),0.1);
        assertEquals(12.24, fraction2.getN(),0.1);
        assertEquals(11.2, fraction3.getM(),0.1);
        assertEquals(14.0, fraction3.getN(),0.1);
        assertEquals(4.7, fraction4.getM(),0.1);
        assertEquals(46.9, fraction4.getN(),0.1);
    }

}
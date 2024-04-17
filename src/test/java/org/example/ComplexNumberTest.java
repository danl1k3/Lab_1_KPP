package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {
    @Test
    public void testAddAll_EmptyList() {
        List<ComplexNumber> numbers = new ArrayList<>();
        ComplexNumber result = ComplexNumber.addAll(numbers);
        assertEquals(0.0, result.getReal());
        assertEquals(0.0, result.getImaginary());
    }

    @Test
    public void testAddAll_SingleNumber() {
        List<ComplexNumber> numbers = new ArrayList<>();
        ComplexNumber number = new ComplexNumber(1.0, 2.0);
        numbers.add(number);
        ComplexNumber result = ComplexNumber.addAll(numbers);
        assertEquals(1.0, result.getReal());
        assertEquals(2.0, result.getImaginary());
    }

    @Test
    public void testAddAll_MultipleNumbers() {
        List<ComplexNumber> numbers = new ArrayList<>();
        numbers.add(new ComplexNumber(1.0, 2.0));
        numbers.add(new ComplexNumber(3.0, 4.0));
        numbers.add(new ComplexNumber(5.0, 6.0));
        ComplexNumber result = ComplexNumber.addAll(numbers);
        assertEquals(9.0, result.getReal());
        assertEquals(12.0, result.getImaginary());
    }

    @Test
    public void testAddAll() {
        List<ComplexNumber> complexNumbers = new ArrayList<>();
        complexNumbers.add(new ComplexNumber(3, 2));
        complexNumbers.add(new ComplexNumber(1, -1));
        complexNumbers.add(new ComplexNumber(4, 5));

        ComplexNumber result = ComplexNumber.addAll(complexNumbers);

        assertEquals(8, result.getReal());
        assertEquals(6, result.getImaginary());
    }

    @Test
    public void testMultiplyAll() {
        List<ComplexNumber> complexNumbers = new ArrayList<>();
        complexNumbers.add(new ComplexNumber(2, 3));
        complexNumbers.add(new ComplexNumber(1, -1));
        complexNumbers.add(new ComplexNumber(4, 2));

        ComplexNumber result = ComplexNumber.multiplyAll(complexNumbers);

        assertEquals(18, result.getReal());
        assertEquals(14, result.getImaginary());
    }




}
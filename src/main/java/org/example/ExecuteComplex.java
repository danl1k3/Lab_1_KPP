package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ExecuteComplex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Уведіть кількість чисел: ");
        int n = scanner.nextInt();

        var complexNumbers = new ArrayList<ComplexNumber>();

        Random random = new Random();


        for (int i = 0; i < n; i++) {
            double realPart = random.nextDouble() * 10;
            double imaginaryPart = random.nextDouble() * 10;
            complexNumbers.add(new ComplexNumber(realPart, imaginaryPart));
        }

        System.out.println("Згенеровані комплексні числа:");
        for (ComplexNumber acomplexNumber : complexNumbers) {
            System.out.println("Дійсна: " + acomplexNumber.getReal() + ", Уявна: " + acomplexNumber.getImaginary());
        }

        ComplexNumber mltRes = ComplexNumber.multiplyAll(complexNumbers);
        System.out.println("\nРезультат множення елементів списку: " + mltRes.getReal() + " + " + mltRes.getImaginary() + "i");

        ComplexNumber addRes = ComplexNumber.addAll(complexNumbers);
        System.out.println("\nРезультат додавання елементів списку: " + addRes.getReal() + " + " + addRes.getImaginary() + "i");

        var fractions = new ArrayList<Fraction>();

        for (int i = 0; i < n; i++) {
            fractions.add(new Fraction(complexNumbers.get(i)));
        }


        System.out.println("\nЗгенеровані дроби:");
        for (int i = 0; i < fractions.size(); i++) {
            Fraction fraction = fractions.get(i);
            System.out.println("Дріб " + (i + 1) + ": M = " + fraction.getM() + ", N = " + fraction.getN());
        }


        Fraction.modEvenEl(fractions);
        System.out.println("\nМодифіковані дроби:");
        for (int i = 0; i < fractions.size(); i++) {
            Fraction fraction = fractions.get(i);
            System.out.println("Дріб " + (i + 1) + ": M = " + fraction.getM() + ", N = " + fraction.getN());
        }
    }

}


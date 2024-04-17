package org.example;
import java.util.List;
import java.util.Random;
public class Fraction {
    private double m;
    private double n;
    Random random = new Random();
    public Fraction(ComplexNumber nx1) {
        this.m = random.nextDouble() * 10 * nx1.getReal();
        this.n = random.nextDouble() * 10 * nx1.getImaginary();
    }
    public Fraction(double _m,double _n, ComplexNumber nx1) {
        this.m = _m * nx1.getReal();
        this.n = _n * nx1.getImaginary();
    }

    public double getM() {
        return m;
    }

    public double getN() {
        return n;
    }
    public static void modEvenEl(List<Fraction> fractions) {
        for (int i = 0; i < fractions.size(); i++) {
            if (i % 2 == 0) {
                continue;
            }
            else {
                if (i + 1 < fractions.size()) {
                    Fraction current = fractions.get(i);
                    Fraction next = fractions.get(i + 1);
                    current.m += next.m;
                    current.n += next.n;
                }
            }
        }
    }


}

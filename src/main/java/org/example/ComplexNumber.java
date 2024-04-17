package org.example;

import java.math.BigDecimal;
import java.util.List;

public class ComplexNumber {

        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public double getReal() {
            return real;
        }
        public double getImaginary() {
            return imaginary;
        }


        public static ComplexNumber addAll(List<ComplexNumber> complexNumbers) {
        double resultReal = 0;
        double resultImaginary = 0;

        for (ComplexNumber num : complexNumbers) {
            resultReal += num.real;
            resultImaginary += num.imaginary;
        }

        return new ComplexNumber(resultReal, resultImaginary);
        }


        public static ComplexNumber multiplyAll(List<ComplexNumber> complexNumbers) {
            BigDecimal resultReal = BigDecimal.ONE;
            BigDecimal resultImaginary = BigDecimal.ZERO;

            for (int i = 0; i < complexNumbers.size() - 1; i++) {
                BigDecimal realPart1 = BigDecimal.valueOf(complexNumbers.get(i).getReal());
                BigDecimal imaginaryPart1 = BigDecimal.valueOf(complexNumbers.get(i).getImaginary());
                BigDecimal realPart2 = BigDecimal.valueOf(complexNumbers.get(i + 1).getReal());
                BigDecimal imaginaryPart2 = BigDecimal.valueOf(complexNumbers.get(i + 1).getImaginary());

                if (i == 0) {
                    resultReal = realPart1.multiply(realPart2)
                            .subtract(imaginaryPart1.multiply(imaginaryPart2));
                    resultImaginary = realPart1.multiply(imaginaryPart2)
                            .add(realPart2.multiply(imaginaryPart1));
                } else {
                    BigDecimal tempReal = resultReal;
                    resultReal = resultReal.multiply(realPart2)
                            .subtract(resultImaginary.multiply(imaginaryPart2));
                    resultImaginary = tempReal.multiply(imaginaryPart2)
                            .add(realPart2.multiply(resultImaginary));
                }
            }
           double dbR = resultReal.doubleValue();
           double dbI = resultImaginary.doubleValue();
        return new ComplexNumber(dbR, dbI);
        }

}



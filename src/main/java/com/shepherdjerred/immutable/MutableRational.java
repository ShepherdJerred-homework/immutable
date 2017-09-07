package com.shepherdjerred.immutable;

public class MutableRational implements Rational {

    private int numerator;
    private int denominator;

    public MutableRational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    public void reduce() {
        int gcd = Math.greatestCommonDivisor(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void add(Rational r) {
        int lcm = Math.leastCommonMultiple(denominator, r.getDenominator());

        int numeratorX = (numerator * lcm) / denominator;
        int numeratorY = (r.getNumerator() * lcm) / r.getDenominator();

        numerator = numeratorX + numeratorY;
        denominator = lcm;
        reduce();
    }

    public void subtract(Rational r) {
        int lcm = Math.leastCommonMultiple(denominator, r.getDenominator());

        int numeratorX = (numerator / lcm) * denominator;
        int numeratorY = (r.getDenominator() / lcm) * r.getNumerator();

        numerator = numeratorY - numeratorX;
        denominator = lcm;
        reduce();
    }

    public void multiply(Rational r) {
        numerator *= r.getNumerator();
        denominator *= r.getDenominator();
        reduce();
    }

    public void divide(Rational r) {
        MutableRational reciprocal = new MutableRational(r.getDenominator(), r.getNumerator());
        multiply(reciprocal);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MutableRational that = (MutableRational) o;

        if (numerator != that.numerator) return false;
        return denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    @Override
    public String toString() {
        return "MutableRational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}

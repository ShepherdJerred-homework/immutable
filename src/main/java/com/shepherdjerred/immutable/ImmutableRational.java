package com.shepherdjerred.immutable;

public class ImmutableRational implements Rational {

    private final int numerator;
    private final int denominator;

    public ImmutableRational(int numerator, int denominator) {
        int gcd = Math.greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public ImmutableRational add(Rational r) {
        int lcm = Math.leastCommonMultiple(denominator, r.getDenominator());

        int numeratorX = (numerator * lcm) / denominator;
        int numeratorY = (r.getNumerator() * lcm) / r.getDenominator();

        return new ImmutableRational(numeratorX + numeratorY, lcm);
    }

    public ImmutableRational subtract(Rational r) {
        int lcm = Math.leastCommonMultiple(denominator, r.getDenominator());

        int numeratorX = (numerator / lcm) * denominator;
        int numeratorY = (r.getDenominator() / lcm) * r.getNumerator();

        return new ImmutableRational(numeratorY - numeratorX, lcm);
    }

    public ImmutableRational multiply(Rational r) {
        int newNumerator = numerator * r.getNumerator();
        int newDenominator = denominator * r.getDenominator();

        return new ImmutableRational(newNumerator, newDenominator);
    }

    public ImmutableRational divide(Rational r) {
        ImmutableRational reciprocal = new ImmutableRational(r.getDenominator(), r.getNumerator());

        return reciprocal.multiply(this);
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

        ImmutableRational that = (ImmutableRational) o;

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
        return "ImmutableRational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}

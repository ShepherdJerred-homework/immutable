package com.shepherdjerred.immutable;

public class Math {

    // https://stackoverflow.com/questions/3154454/what-is-the-most-efficient-way-to-calculate-the-least-common-multiple-of-two-int
    public static int leastCommonMultiple(int x, int y) {
        return x / greatestCommonDivisor(x, y) * y;
    }

    // https://en.wikipedia.org/wiki/Euclidean_algorithm#Procedure
    public static int greatestCommonDivisor(int x, int y) {
        while (y != 0) {
            int t = y;
            y = x % y;
            x = t;
        }
        return x;
    }

}

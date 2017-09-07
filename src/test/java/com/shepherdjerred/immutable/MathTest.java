package com.shepherdjerred.immutable;

import org.junit.Test;

public class MathTest {
    @Test
    public void leastCommonMultiple() {
        int x = Math.leastCommonMultiple(4, 6);
        int expected = 12;

        assert x == expected;

        x = Math.leastCommonMultiple(2, 4);
        expected = 4;

        assert x == expected;
    }

    @Test
    public void greatestCommonDivisor() {
        int x = Math.greatestCommonDivisor(54, 24);
        int expected = 6;

        assert x == expected;
    }

}
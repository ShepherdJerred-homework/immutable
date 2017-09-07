package com.shepherdjerred.immutable;

import org.junit.Test;

public class MutableRationalTest {
    @Test
    public void add() {
        MutableRational x = new MutableRational(1, 2);
        MutableRational y = new MutableRational(1, 2);
        MutableRational expected = new MutableRational(1, 1);

        x.add(y);

        assert x.equals(expected);

        x = new MutableRational(1, 2);
        y = new MutableRational(1, 4);
        expected = new MutableRational(3, 4);

        x.add(y);

        assert x.equals(expected);
    }

    @Test
    public void subtract() {
        MutableRational x = new MutableRational(1, 1);
        MutableRational y = new MutableRational(1, 1);
        MutableRational expected = new MutableRational(0, 1);

        x.subtract(y);

        assert x.equals(expected);

        x = new MutableRational(1, 2);
        y = new MutableRational(1, 4);
        expected = new MutableRational(1, 4);

        x.subtract(y);

        assert x.equals(expected);
    }

    @Test
    public void multiply() {
        MutableRational x = new MutableRational(2, 1);
        MutableRational y = new MutableRational(2, 1);
        MutableRational expected = new MutableRational(4, 1);

        x.multiply(y);

        assert x.equals(expected);
    }

    @Test
    public void divide() {
        MutableRational x = new MutableRational(4, 1);
        MutableRational y = new MutableRational(2, 1);
        MutableRational expected = new MutableRational(2, 1);

        x.divide(y);

        assert x.equals(expected);
    }

    @Test
    public void constructor() {
        MutableRational x = new MutableRational(2, 4);
        MutableRational expected = new MutableRational(1, 2);

        assert x.equals(expected);

        x = new MutableRational(2, 6);
        expected = new MutableRational(1, 3);

        assert x.equals(expected);
    }

}
package com.shepherdjerred.immutable;

import org.junit.Test;

public class ImmutableRationalTest {
    @Test
    public void add() {
        ImmutableRational x = new ImmutableRational(1, 2);
        ImmutableRational y = new ImmutableRational(1, 2);
        ImmutableRational expected = new ImmutableRational(1, 1);

        assert x.add(y).equals(expected);

        x = new ImmutableRational(1, 2);
        y = new ImmutableRational(1, 4);
        expected = new ImmutableRational(3, 4);

        assert x.add(y).equals(expected);
    }

    @Test
    public void subtract() {
        ImmutableRational x = new ImmutableRational(1, 1);
        ImmutableRational y = new ImmutableRational(1, 1);
        ImmutableRational expected = new ImmutableRational(0, 1);

        assert x.subtract(y).equals(expected);

        x = new ImmutableRational(1, 2);
        y = new ImmutableRational(1, 4);
        expected = new ImmutableRational(1, 4);

        assert x.subtract(y).equals(expected);
    }

    @Test
    public void multiply() {
        ImmutableRational x = new ImmutableRational(2, 1);
        ImmutableRational y = new ImmutableRational(2, 1);
        ImmutableRational expected = new ImmutableRational(4, 1);

        assert x.multiply(y).equals(expected);
    }

    @Test
    public void divide() {
        ImmutableRational x = new ImmutableRational(4, 1);
        ImmutableRational y = new ImmutableRational(2, 1);
        ImmutableRational expected = new ImmutableRational(2, 1);

        assert x.divide(y).equals(expected);
    }

    @Test
    public void constructor() {
        ImmutableRational x = new ImmutableRational(2, 4);
        ImmutableRational expected = new ImmutableRational(1, 2);

        assert x.equals(expected);

        x = new ImmutableRational(2, 6);
        expected = new ImmutableRational(1, 3);

        assert x.equals(expected);
    }

}
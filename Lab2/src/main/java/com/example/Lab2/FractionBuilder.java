package com.example.Lab2;

import java.util.OptionalInt;
import java.util.stream.IntStream;

class FractionBuilder implements Builder {
    private final Component fraction;

    public FractionBuilder() {
        fraction = new Composite();
    }

    private void addLeafFromArray(int[] array, int index) {
        if (array != null && index < array.length) {
            fraction.add(new Leaf(array[index]));
        }
    }

    @Override
    public void buildFraction(int n, int[] an, int[] bn) {
        IntStream.range(0, n)
                .forEach(i -> {
                    addLeafFromArray(an, i);
                    addLeafFromArray(bn, i);
                });
    }

    @Override
    public Component getFraction() {
        return fraction;
    }
}

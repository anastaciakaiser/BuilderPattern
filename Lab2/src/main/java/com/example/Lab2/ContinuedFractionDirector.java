package com.example.Lab2;

public class ContinuedFractionDirector {
    public ContinuedFractionComposite build(ContinuedFractionBuilder builder, int[] integers, int[] numerators) {
        if (integers.length != numerators.length + 1) {
            throw new IllegalArgumentException("Invalid input arrays: lengths do not match.");
        }

        for (int i = 0; i < numerators.length; i++) {
            builder.addComponent(integers[i]);
            builder.addComponent(numerators[i]);
        }

        // Add the last integer (without a corresponding numerator)
        builder.addComponent(integers[integers.length - 1]);

        return builder.getResult();
    }
}

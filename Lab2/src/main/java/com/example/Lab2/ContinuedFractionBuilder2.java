package com.example.Lab2;

public class ContinuedFractionBuilder2 implements ContinuedFractionBuilder {
    private ContinuedFractionComposite fraction = new ContinuedFractionComposite();

    @Override
    public void addComponent(int value) {
        fraction.addComponent(new FractionLeaf(value));
    }

    @Override
    public ContinuedFractionComposite getResult() {
        return fraction;
    }
}

package com.example.Lab2;

public class FractionBuilder1 implements Builder {
    private ContinuedComposite fraction = new ContinuedComposite();

    @Override
    public void addComponent(int value) {
        fraction.addComponent(new Leaf(value));
    }

    @Override
    public ContinuedComposite getResult() {
        return fraction;
    }
}

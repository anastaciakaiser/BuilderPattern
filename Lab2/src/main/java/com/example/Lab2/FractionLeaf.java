package com.example.Lab2;
public class FractionLeaf implements FractionComponent{

    private final int value;

    public FractionLeaf(int value) {
        this.value = value;
    }

    @Override
    public String print() {
        return String.valueOf(value);
    }
}



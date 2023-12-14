package com.example.Lab2;
public class Leaf implements Component {

    private final int value;

    public Leaf(int value) {
        this.value = value;
    }

    @Override
    public String print() {
        return String.valueOf(value);
    }
}



package com.example.Lab2;

public class Leaf implements Component {
    private String value;

    public Leaf(int value) {
        this.value = Integer.toString(value);
    }

    @Override
    public Component add(Component obj) {
        return this;
    }

    @Override
    public String print() {
        return value + " ";
    }
}

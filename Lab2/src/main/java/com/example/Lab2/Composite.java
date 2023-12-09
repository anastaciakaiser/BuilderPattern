package com.example.Lab2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> components;

    public Composite() {
        components = new ArrayList<>();
    }

    @Override
    public Component add(Component obj) {
        components.add(obj);
        return this;
    }

    @Override
    public String print() {
        StringBuilder builder = new StringBuilder("(");

        for (int i = 0; i < components.size(); i++) {
            builder.append(components.get(i).print());

            if (i < components.size() - 1) {
                builder.append("+ 1/(");
            }
        }

        for (int i = 0; i < components.size() - 1; i++) {
            builder.append(")");
        }

        builder.append(")");
        return builder.toString();
    }
}

package com.example.Lab2;

import java.util.ArrayList;
import java.util.List;

public class ContinuedComposite implements Component {

    private final List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public String print() {
        StringBuilder result = new StringBuilder("(");

        for (int i = 0; i < components.size(); i++) {
            result.append(components.get(i).print());

            if (i % 2 == 0 && i < components.size() - 1) {
                result.append(" + ");
            } else if (i < components.size() - 1) {
                result.append("/(");
            }
        }

        result.append(")");

        return result.toString();
    }

}

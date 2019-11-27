package com.iroshnk.java.design.structural.decorator;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }
}

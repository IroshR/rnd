package com.iroshnk.java.design.structural.bridge;

public class PyrogenIgniter implements Igniter {
    @Override
    public void ignite() {
        System.out.println("Pyrogen Igniter");
    }
}

package com.iroshnk.java.design.structural.bridge;

public class AirToAirMissile implements Missile {
    private  Igniter igniter;

    public AirToAirMissile(Igniter igniter) {
        this.igniter = igniter;
    }

    @Override
    public void explode() {
        System.out.println("Air To Air Missile");
        igniter.ignite();
    }
}

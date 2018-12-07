package com.iroshnk.java.json;

/**
 * Created by HP on 1/8/2018.
 */
public class Address {
    private String street;
    private String city;
    private int zipCode;

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getZipCode() {
        return zipCode;
    }
    public void setZipcode(int zipcode) {
        this.zipCode = zipcode;
    }

    @Override
    public String toString(){
        return getStreet() + ", "+getCity()+", "+getZipCode();
    }
}

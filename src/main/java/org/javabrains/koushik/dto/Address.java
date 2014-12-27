package org.javabrains.koushik.dto;

import javax.persistence.Embeddable;

/**
 * Created by Ashot Karakhanyan on 27-12-2014
 */

@Embeddable
public class Address {

    private String street;
    private String city;
    private String state;
    private String pinCode;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}

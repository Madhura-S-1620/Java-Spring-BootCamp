package com.annotationconfig.beans;

public class Country {

    String countryName;

    public Country(String countryName) {
        this.countryName=countryName;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
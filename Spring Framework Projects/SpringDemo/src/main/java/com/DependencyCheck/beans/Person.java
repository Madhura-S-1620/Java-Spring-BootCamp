package com.DependencyCheck.beans;


import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;
    private Address address;

    // Getter and Setter methods
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }
}


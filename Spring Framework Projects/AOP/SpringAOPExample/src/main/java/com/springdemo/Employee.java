package com.springdemo;



public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void work() {
        System.out.println(name + " is working...");
    }

    public void takeBreak() {
        System.out.println(name + " is taking a break...");
    }

    public void throwException() {
        throw new RuntimeException("Oops! Something went wrong.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

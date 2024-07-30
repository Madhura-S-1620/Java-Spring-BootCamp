package Advice.Models;

public class Student {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printSNameId() {
        System.out.println("Student : Method printSNameId() : My full name is " + name + " and my sid is " + id);
    }

    public void checkSName() {
        if (name.length() < 20) {
            throw new IllegalArgumentException();
        }
    }

    public void Test(String message) {
        System.out.println("Student : Method Test() : Testing! " + message);
    }
}

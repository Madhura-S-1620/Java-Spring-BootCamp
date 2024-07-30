package org.example;



public class GreetingRepo {

    private String greet;

    public GreetingRepo(String msg)
    {
        this.greet=msg;
    }

    public String greetShow()
    {
        System.out.println(greet);
        return greet;
    }

    public String WelcomeGreet()
    {
        greet = "Pranam " + greet;
        System.out.println(greet);
        return greet;
    }
}

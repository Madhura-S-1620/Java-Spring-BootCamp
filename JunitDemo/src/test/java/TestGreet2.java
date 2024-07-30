

import org.example.GreetingRepo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGreet2 {

    String newGreet = "Lord";
    GreetingRepo greetingRepo=new GreetingRepo(newGreet);
    @Test
    public void testWelcomeGreet()
    {
        System.out.println("Inside testWelcomeGreet() method...");
        newGreet =  "Pranam " +" "+"Lord";
        assertEquals(newGreet,greetingRepo.WelcomeGreet());
    }
}

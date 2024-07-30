

import org.example.GreetingRepo;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestGreet1 {

    String newGreet = "Lord";
    GreetingRepo greetingRepo = new GreetingRepo(newGreet);


    @Test
    public void testGreetMessage() {
        System.out.println("Inside greetShow() method..");
        assertEquals(newGreet, greetingRepo.greetShow());
    }
}

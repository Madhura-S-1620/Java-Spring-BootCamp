import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTestCase {

    private final Calculator calculator=new Calculator();
    @Test
    void Addition()
    {
        assertEquals(3,calculator.AddMethod(2,1));
    }
}

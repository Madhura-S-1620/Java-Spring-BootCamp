import org.example.Calculator;
import org.junit.jupiter.api.*;

@TestMethodOrder(value = MethodOrderer.Random.class)
public class CalculatorTests {
    private final Calculator newCalci=new Calculator();

    @BeforeAll
    public static void setUpClass()
    {
        System.out.println("This is @BeforeAll annotation..");
    }
    @BeforeEach
    public void setUp()
    {
        System.out.println("This is @BeforeEach annotation..");
    }


    @Order(2)
    public void testAddtion()
    {
        System.out.println("This is first test..");
        var actualres=newCalci.AddMethod(4,5);
        Assertions.assertEquals(9,actualres);
        System.out.println(actualres);

    }

    @Test                 //here order doesnt matter only @Test matters on which method it is annotated is get executed

    @Order(1)
    public void testAdditionDiffNumber(){
        System.out.println("This is second test");
        var newRes=newCalci.AddMethod(7,8);
        Assertions.assertEquals(15,newRes);
        System.out.println(newRes);
    }
    @AfterEach
    public void tearDown()
    {
        System.out.println("This is AfterEach annotation..");
    }
}

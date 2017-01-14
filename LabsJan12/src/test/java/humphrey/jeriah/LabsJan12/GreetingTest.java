package humphrey.jeriah.LabsJan12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 1/13/17.
 */
public class GreetingTest {

    Greeting greeting;

    @Before
    public void setup(){
        greeting = new Greeting();
    }

    @Test
    public void getNameTest(){
        String expected= "John";
        String actual = greeting.getName("John");
        assertEquals("I expect the name to return what i type in",expected, actual);
    }
    @Test
    public void NameCheckBobTest(){
        String expected= "Hi Bob";
        String actual = greeting.nameCheck("Bob");

        assertEquals("I expect Hi Bob to print out",expected, actual);
    }

    @Test
    public void NameCheckAliceTest(){
        String expected= "Hi Alice";
        String actual = greeting.nameCheck("Alice");
        assertEquals("I expect Hi Alice to print out",expected, actual);
    }
}

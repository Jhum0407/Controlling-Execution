package humphrey.jeriah.LabsJan12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 1/13/17.
 */
public class SecretNumberTest {
    SecretNumber s;

    @Before
    public void setUp(){
        s= new SecretNumber();
    }


    @Test
    public void conditionTooHignTest(){
        String expected= "You're too high";
        String actual=s.condition(11, ((int) (Math.random() * (10-1))) + 1);
        assertEquals("I expect the guess to be too high", expected, actual);
    }

    @Test
    public void conditionToolowTest(){
        String expected= "You're too low";
        String actual=s.condition(0,((int) (Math.random() * (10-1))) + 1);
        assertEquals("I expect the guess to be too low", expected, actual);
    }
    @Test
    public void guessComparisonTest(){
        int expected= 1;
        int actual=s.guessComparison(0,1);
        assertEquals("I expect the counter to go up", expected, actual);
    }
    @Test
    public void countmessageTest(){
        String expected= "You took 0 tries";
        String actual=s.countMessage();
        assertEquals("I expect You took 0 tries", expected, actual);
    }
}
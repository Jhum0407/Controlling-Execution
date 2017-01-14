package humphrey.jeriah.LabsJan12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 1/13/17.
 */
public class SumLoopTest {
    SumLoop s2;

    @Before
    public void setup(){
        s2 = new SumLoop();
    }
    @Test
    public void getRangeTest(){
        int expected=3;
        int actual= s2.getRange(3);
        assertEquals(expected, actual);
    }

   @Test
    public void sumTest(){
        int expected=10;
        int actual=s2.Sum(4);
        assertEquals(expected, actual);

   }

}
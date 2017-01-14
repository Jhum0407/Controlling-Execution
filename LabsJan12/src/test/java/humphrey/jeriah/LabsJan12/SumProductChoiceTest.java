package humphrey.jeriah.LabsJan12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 1/13/17.
 */
public class SumProductChoiceTest {
    SumProductChoice choice;

    @Before
    public void setup() {

        choice = new SumProductChoice();


    }

    @Test
    public void sumTest() {
        int expected = 10;
        int actual = choice.Sum(4);
        assertEquals(expected, actual);

    }

    @Test
    public void productTest() {
        int expected = 24;
        int actual = choice.Product(4);
        assertEquals(expected, actual);

    }

    @Test
    public void sumchoiceTest() {
        int expected = 10;
        int actual = choice.choice("sum", 4);
        assertEquals(expected, actual);

    }

    @Test
    public void productchoiceTest() {
        int expected = 24;
        int actual = choice.choice("product", 4);
        assertEquals(expected, actual);
    }
}



import org.junit.jupiter.api.Test;
import tdd.StringCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringCalculatorTest {

    StringCalculator stringCalculator=new StringCalculator ();

    @Test
    public void testByPassingEmptyString() throws Exception{
        assertEquals(0,stringCalculator.addNumbers (""));
    }

    @Test
    public void testByPassingOneNumber() throws Exception{
        assertEquals (1,stringCalculator.addNumbers ("1"));
    }

    @Test
    public void testByPassingTwoNumbers() throws Exception{
        assertEquals (3,stringCalculator.addNumbers ("1,2"));
    }

    @Test
    public void testByPassingMoreNumbers() throws Exception{
        assertEquals (15,stringCalculator.addNumbers ("1,2,3,4,5"));
    }

    @Test
    public void testByPassingInvalidCase() throws Exception{
        assertEquals (6,stringCalculator.addNumbers ("1\n2,3"));
    }

    @Test
    public void testByPassingDelimiter() throws Exception{
        assertEquals (3,stringCalculator.addNumbers ("//;\n1;2"));
    }
}

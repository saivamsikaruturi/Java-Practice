import com.vamsi.javaPractice.tdd.RomanNumber;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RomanNumberTests {

    @Test
    public void aSingleNumber(){
       RomanNumber roman= new RomanNumber();
      int number= roman.convert("V");
      assertEquals(5,number);

    }

    @Test
    public void aCompositeNumber(){
        RomanNumber roman= new RomanNumber();
        int number= roman.convert("II");
        assertEquals(2,number);
        assertEquals(6,roman.convert("VI"));
        assertEquals(16,roman.convert("XVI"));

    }

    @Test
    public void aCompositeNumberWithRegression(){
        RomanNumber roman= new RomanNumber();
        int number= roman.convert("VMM");
        assertEquals(1995,number);
    }
}

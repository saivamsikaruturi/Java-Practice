import com.vamsi.javaPractice.BiggerAndSmaller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BiggerAndSmallerTests {
  private  BiggerAndSmaller biggerAndSmaller;

  @BeforeEach
    public void setup(){
        biggerAndSmaller = new BiggerAndSmaller();
      System.out.println("setup");
    }

    private int[] nums(int... ns){
      return ns;
    }

    @Test
    public void testByPassingEmptyString() {
        biggerAndSmaller.findBiggerAndSmaller(nums(4, 3, 2));
        assertNumbers(4,2);
    }

    private void assertNumbers(int bigger ,int smaller) {
        assertEquals(bigger, biggerAndSmaller.getBigger());
        assertEquals(smaller, biggerAndSmaller.getSmaller());
    }


    @Test
    public void testByPassingEmptyString1() {
        biggerAndSmaller.findBiggerAndSmaller(new int[]{2, 3, 4});
        assertNumbers(4,2);
    }

    @Test
    public void testByPassingEmptyString5() {
        biggerAndSmaller.findBiggerAndSmaller(new int[]{2, 10,11,45});
        assertNumbers(45,2);
    }

    @Test
    public void testByPassingEmptyString2() {
        biggerAndSmaller.findBiggerAndSmaller(new int[]{2});
        assertNumbers(2,2);
    }

    @Test
    public void testByPassingEmptyString3() {
        biggerAndSmaller.findBiggerAndSmaller(new int[]{2, 4, 3,2,2});
        assertNumbers(4,2);
    }

}

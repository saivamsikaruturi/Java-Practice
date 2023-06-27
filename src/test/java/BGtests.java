import InterviewQuestions.BiggerAndSmaller;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class BGtests {

    @Test
    void testBiggerSmaller_WhenPassingIncreasingOrderNumbers_returnBiggerAndSmaller(){
        //Arrange

        BiggerAndSmaller biggerAndSmaller=new BiggerAndSmaller();
        int array[]={18,17,16};

        //Act

        biggerAndSmaller.findBiggerAndSmaller(array);

        //Assert

        assertEquals(18,biggerAndSmaller.getBigger());
        assertEquals(16,biggerAndSmaller.getSmaller());
    }


     @ParameterizedTest
    @DisplayName("test parameterized test")
    @MethodSource("biggerSmallerTest")
    void testBiggerSmaller_WhenPassingIncreasingOrderNumbersAcceptingParameters_returnBiggerAndSmaller(int[] array){
        //Arrange

        BiggerAndSmaller biggerAndSmaller=new BiggerAndSmaller();
//        int array[]={18,17,16};

        //Act

        biggerAndSmaller.findBiggerAndSmaller(array);

        //Assert

        assertEquals(18,biggerAndSmaller.getBigger());
        assertEquals(16,biggerAndSmaller.getSmaller());
    }

    private static Stream<int[]> biggerSmallerTest(){
        return Stream.of(new int[]{18,17,16});
    }
}

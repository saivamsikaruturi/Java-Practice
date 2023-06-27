package com.vamsi.javaPractice.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tdd.AddNumbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAddNumbers {

    @Test
    @DisplayName("passing zero as the argument")
    void testAddNumbers_whenPassingNoNumbers_ReturnZero(){
        //Arrange
        AddNumbers addNumbers=new AddNumbers();

        //Act
        int result =addNumbers.testAddNumbers("");

        //Assert
        assertEquals(0, result);
    }

    @Test
    void testAddNumbers_whenPassingSingleNumber_ReturnSameNumber(){
        //Arrange
        AddNumbers addNumbers=new AddNumbers();

        //Act
        int result =addNumbers.testAddNumbers("1");

        //Assert
        assertEquals(1, result);
    }

    @Test
    void testAddNumbers_whenPassingTwoNumbers_ReturnAddedResult(){
        //Arrange
        AddNumbers addNumbers=new AddNumbers();

        //Act
        int result =addNumbers.testAddNumbers("1,2");

        //Assert
        assertEquals(3, result);
    }

    @Test
    void testAddNumbers_whenPassingTwoNumbersAndSpecialCharacters_ReturnAddedResult(){
        //Arrange
        AddNumbers addNumbers=new AddNumbers();

        //Act
        int result =addNumbers.testAddNumbers("1\n2,3");

        //Assert
        assertEquals(6, result);
    }

}

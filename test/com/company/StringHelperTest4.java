package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest4 {

    StringHelper testStringHelper = new StringHelper();

    //refactoring
    @Test
    public void testTruncate() {
        //  fail("not implemented yet");
        String actual = testStringHelper.truncateAInFirst2Positions("AACD");
        String expected = "CD";

        assertEquals(expected, testStringHelper.truncateAInFirst2Positions("AACD"));
        //assertEquals(expected,actual);
        //assertEquals("ABC", "ABCD");


    }
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_negative(){
        boolean actual = testStringHelper.areFirstAndLastTwoCharactersTheSame("ABCD");
        boolean expected = false;
        //assertEquals(expected,actual);

        //better approach
        assertFalse(testStringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_positive(){
        boolean actual = testStringHelper.areFirstAndLastTwoCharactersTheSame("ABAB");
        boolean expected = false;
        //assertEquals(expected,actual);

        //better approach
        assertTrue(testStringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
}
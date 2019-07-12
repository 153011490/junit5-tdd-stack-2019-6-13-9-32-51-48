package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberGameTest {
    @Test
    public void should_return_1_when_call_number_given_1(){

        //given
        String expectd="1";

        //when
        String actual=NumberGame.number(1);

        //then
        assertEquals(expectd,actual);
    }
}
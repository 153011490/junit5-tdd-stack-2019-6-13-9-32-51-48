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

    @Test
    public void should_return_Fizz_when_call_number_given_3(){

        //given
        String expectd="Fizz";

        //when
        String actual=NumberGame.number(3);

        //then
        assertEquals(expectd,actual);

    }

    @Test
    public void should_return_Buzz_when_call_number_given_5(){

        //given
        String expectd="Buzz";

        //when
        String actual=NumberGame.number(5);

        //then
        assertEquals(expectd,actual);

    }

    @Test
    public void should_return_Whizz_when_call_number_given_7(){

        //given
        String expectd="Whizz";

        //when
        String actual=NumberGame.number(7);

        //then
        assertEquals(expectd,actual);

    }

    @Test
    public void should_return_Fizz_when_call_number_given_13(){

        //given
        String expectd="Fizz";

        //when
        String actual=NumberGame.number(13);

        //then
        assertEquals(expectd,actual);

    }
}

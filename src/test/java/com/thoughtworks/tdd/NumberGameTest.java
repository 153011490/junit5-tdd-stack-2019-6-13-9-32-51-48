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

    @Test
    public void should_return_FizzBuzz_when_call_number_given_15(){

        //given
        String expectd="FizzBuzz";

        //when
        String actual=NumberGame.number(15);

        //then
        assertEquals(expectd,actual);

    }

    @Test
    public void should_return_FizzWhizz_when_call_number_given_21(){

        //given
        String expectd="FizzWhizz";

        //when
        String actual=NumberGame.number(21);

        //then
        assertEquals(expectd,actual);

    }

    @Test
    public void should_return_BuzzWhizz_when_call_number_given_35(){

        //given
        String expectd="BuzzWhizz";

        //when
        String actual=NumberGame.number(35);

        //then
        assertEquals(expectd,actual);

    }

    @Test
    public void should_return_FizzBuzzWhizz_when_call_number_given_105(){

        //given
        String expectd="FizzBuzzWhizz";

        //when
        String actual=NumberGame.number(105);

        //then
        assertEquals(expectd,actual);

    }
}

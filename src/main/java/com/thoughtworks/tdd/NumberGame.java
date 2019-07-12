package com.thoughtworks.tdd;

public class NumberGame {
    public static String number(int i){
        if(i%105==0)return "FizzBuzzWhizz";
        if(i%35==0)return "BuzzWhizz";
        if(i%21==0)return "FizzWhizz";
        if(i%15==0)return "FizzBuzz";
        if(i%7==0)return "Whizz";
        if(i%5==0)return "Buzz";
        if(i%3==0||i==13)return "Fizz";
        return ""+i;
    }
}

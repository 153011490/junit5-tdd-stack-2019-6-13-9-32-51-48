package com.thoughtworks.tdd;

public class NumberGame {
    public static String number(int i){
        if(i%3==0||i==13){
            if(i%5==0)return "FizzBuzz";
            return "Fizz";
        }
        if(i%5==0){
            return "Buzz";
        }
        if(i%7==0){
            return "Whizz";
        }
        return ""+i;
    }
}

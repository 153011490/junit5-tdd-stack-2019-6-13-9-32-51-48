package com.thoughtworks.tdd;

public class NumberGame {
    public static String number(int i){
        if(i%3==0||i==13){
            if(i%5==0){
                if(i%7==0)return "FizzBuzzWhizz";
                return "FizzBuzz";
            }
            if(i%7==0)return "FizzWhizz";

            return "Fizz";
        }
        if(i%5==0){
            if(i%7==0)return "BuzzWhizz";
            return "Buzz";
        }
        if(i%7==0){
            return "Whizz";
        }
        return ""+i;
    }
}

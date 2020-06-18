package com.twschool.practice;

public class FizzBuzzWhizz {
    public String say(int i) {
        StringBuffer result = new StringBuffer();
        if (i % 3 == 0) {
            result.append("Fizz");
            if (i % 5 == 0) {
                result.append("Buzz");
            }
            if (i % 7 == 0) {
                result.append("Whizz");
            }
        } else if (i % 5 == 0) {
            result.append("Buzz");
            if (i % 7 == 0) {
                result.append("Whizz");
            }
        } else if (i % 7 == 0) {
            result.append("Whizz");
        } else {
            result.append(String.valueOf(i));
        }
        return result.toString();
    }
}

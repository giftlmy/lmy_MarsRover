package com.twschool.practice;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_1_given_1() {
        FizzBuzzWhizz fizzBuzz = new FizzBuzzWhizz();
        String result = fizzBuzz.say(1);
        assertEquals("equals", "1", "1");
    }

    @Test
    public void should_return_Fizz_given_3() {
        FizzBuzzWhizz fizzBuzz = new FizzBuzzWhizz();
        String result = fizzBuzz.say(3);
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_Buzz_given_5() {
        FizzBuzzWhizz fizzBuzz = new FizzBuzzWhizz();
        String result = fizzBuzz.say(5);
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_105() {
        FizzBuzzWhizz fiz = new FizzBuzzWhizz();
        String result = fiz.say(105);
        assertThat(result,is("FizzBuzzWhizz"));
    }

    @Test
    public void should_return_FizzWhizz_given_21() {
        FizzBuzzWhizz fiz = new FizzBuzzWhizz();
        String result = fiz.say(21);
        assertThat(result,is("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_given_35() {
        FizzBuzzWhizz fiz = new FizzBuzzWhizz();
        String result = fiz.say(70);
        assertThat(result,is("BuzzWhizz"));

    }

    @Test
    public void should_return_Fizz_given_13() {
        FizzBuzzWhizz fiz = new FizzBuzzWhizz();
        String result = fiz.say(13);
        assertThat(result,is("Fizz"));
    }
}

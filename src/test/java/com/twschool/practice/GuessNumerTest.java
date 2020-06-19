package com.twschool.practice;

import org.junit.Test;

public class GuessNumerTest {
    @Test
    public void should_return_4A_0B_given_1_2_3_4() {
        //given
        String[] userAnswer = {"1","2","3","4"};
        //when
        GuessNumer guessNumer = new GuessNumer();
        guessNumer.check(userAnswer);
        //then

    }
}

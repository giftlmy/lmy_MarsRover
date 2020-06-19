package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
public class GuessNumerTest {
    @Test
    public void should_return_4A0B_when_compare_with_1234_given_answer_1234() {
        //given
        GameAnswer answer = new GameAnswer("1 2 3 4");
        //when
        String result = answer.check("1 2 3 4");
        //then
        Assert.assertEquals("4A0B", result);
    }

    @Test
    public void should_return_0A4B_when_compare_with_4321_given_answer_1234() {
        //given
        GameAnswer answer = new GameAnswer("1 2 3 4");
        //when
        String result = answer.check("4 3 2 1");
        //then
        Assert.assertEquals("0A4B", result);
    }
    @Test
    public void should_return_2A0B_when_compare_with_1256_given_answer_1234() {
        //given
        GameAnswer answer = new GameAnswer("1 2 3 4");
        //when
        String result = answer.check("1 2 5 6");
        //then
        Assert.assertEquals("2A0B", result);
    }
    @Test
    public void should_return_SUCCEED_when_status_after_input_1234_given_answer_1234() {
        //given
        GameAnswer answer = new GameAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        //when
        guessNumberGame.guess("1 2 3 4");
        GameStatus gameStatus = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.SUCCEED, gameStatus);
    }
    @Test
    public void should_return_FAILED_when_status_after_input_1256_6_times_given_answer_1234() {
        //given
        GameAnswer answer = new GameAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        //when
        guessNumberGame.guess("1 2 5 6");
        guessNumberGame.guess("1 2 5 6");
        guessNumberGame.guess("1 2 5 6");
        guessNumberGame.guess("1 2 5 6");
        guessNumberGame.guess("1 2 5 6");
        guessNumberGame.guess("1 2 5 6");
        GameStatus gameStatus = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.FAILED, gameStatus);
    }
    @Test
    public void should_return_CONTINUED_when_status_after_input_1267_given_answer_1234() {
        //given
        GameAnswer answer = new GameAnswer("1 2 3 4");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        //when
        guessNumberGame.guess("1 2 6 7");
        GameStatus gameStatus = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.CONTINUED, gameStatus);
    }

}
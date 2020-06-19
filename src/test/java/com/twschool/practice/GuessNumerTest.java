package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
public class GuessNumerTest {
   @Test
       public void should_return_4A0B_when_compare_with_1234_given_answer_1234() {
           GameAnswer answer = new GameAnswer("1 2 3 4");

           String result = answer.check("1 2 3 4");

           Assert.assertEquals("4A0B",result);
       }



}

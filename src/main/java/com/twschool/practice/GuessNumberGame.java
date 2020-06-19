package com.twschool.practice;

public class GuessNumberGame {
    private static final int MAX_TRY_TIMES = 6;
    private GameAnswer gameAnswer;
    private GameStatus gameStatus = GameStatus.CONTINUED;
    private int lefTryTimes = MAX_TRY_TIMES;
    public GuessNumberGame(GameAnswer gameAnswer) {
        this.gameAnswer = gameAnswer;
    }

    public String guess(String userAnswerString) {
       String result = gameAnswer.check(userAnswerString);
       lefTryTimes --;
       if("4A0B".equals(result)){
           gameStatus = GameStatus.SUCCEED;
       }else if(lefTryTimes == 0){
           gameStatus = GameStatus.FAILED;
       }
       return result;
    }

    public GameStatus getStatus() {
        return gameStatus;
    }
}

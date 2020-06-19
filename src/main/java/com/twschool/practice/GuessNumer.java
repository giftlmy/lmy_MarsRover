package com.twschool.practice;

public class GuessNumer {
    private String[] gameAnswer = {"1","2","3","4"};
    private String result;
    int countA = 0;
    int countB = 0;
    public GuessNumer() {

    }

    public void check(String[] userAnswer) {
       for(int i = 0;i < 4;i++){//原始数组
           for(int j = 0;j<4;j++){//输入数组
               if(gameAnswer[i].equals(userAnswer[j])){
                   if(i == j){//位置相同
                       countA++;
                   }else{//位置相同，数字不同
                       countB++;
                   }
               }
           }
       }



    }

    public String[] getGameAnswer() {
        return gameAnswer;
    }

    public String getResult() {
        return result;
    }

    public void setGameAnswer(String[] gameAnswer) {
        this.gameAnswer = gameAnswer;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

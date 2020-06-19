package com.twschool.practice;

public enum Direction {
    E,S,W,N;
    public Direction leftDirection() {
        if(this == N){





            return W;
        }
        if(this == W){
            return S;
        }
        if(this == S){
            return E;
        }
        if(this == E){
            return N;
        }
        return null;
    }
}

package com.twschool.practice;

public class Coordinate {
    private int x;
    private int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void increaseCoordinateY() {
        this.y = y + 1;
    }

    public void reducCoordinateY() {
        this.y = y - 1;
    }
}

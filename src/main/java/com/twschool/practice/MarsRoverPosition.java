package com.twschool.practice;

public class MarsRoverPosition {
    private  Coordinate coordinate;
    private  Direction direction;

    public MarsRoverPosition() {
    }

    public MarsRoverPosition(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Direction getDirection() {
        return direction;
    }
}
